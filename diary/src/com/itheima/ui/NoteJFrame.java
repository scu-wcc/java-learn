package com.itheima.ui;

import domain.UserData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class NoteJFrame extends JFrame implements ActionListener {



    //将用户的数据打包成集合
    ArrayList<UserData> userDataList = new ArrayList<>();
    
    
/*    ArrayList<String> idList= new ArrayList<>();
    ArrayList<String> titleList= new ArrayList<>();
    ArrayList<String> textList= new ArrayList<>();*/

    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");

    public NoteJFrame() {
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if(obj == add){
            System.out.println("添加按钮被点击");
            this.setVisible(false);
            new AddJFrame();

        }else if(obj == update){
            System.out.println("修改按钮被点击");
            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据
            int i = table.getSelectedRow();

            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            if(i<0){
                //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
                showJDialog("请选择要修改的记录！");
            }else{
                //3.如果选择了，跳转添加界面
                this.setVisible(false);
                System.out.println("要修改的记录ID="+(i+1));
                new UpdateJFrame(i);
            }




        }else if(obj == delete){
            System.out.println("删除按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，弹框提示：是否确定删除。此时提示的弹框用showChooseJDialog方法
            //获取用户选择要删除的记录行
            int selectIndex = table.getSelectedRow();
            if(selectIndex<0){
                showJDialog("请选择要删除的记录！");
            }else{
                //作用：展示一个带有确定和取消按钮的弹框
                //方法的返回值：0 表示用户点击了确定
                //             1 表示用户点击了取消
                //该弹框用于用户删除时候，询问用户是否确定删除
                int i = showChooseJDialog();
                if(i==0){
                    //选择删除
                   try {
                       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("diary\\tablelist.data"));
                       userDataList = (ArrayList<UserData>)ois.readObject();
                       ois.close();
                   }catch (IOException | ClassNotFoundException ioe){
                       ioe.printStackTrace();
                   }
                   
                   
                   userDataList.remove(selectIndex);
                    int count = userDataList.size();
                    for (int j = selectIndex; j < count; j++) {
                        UserData currUser = userDataList.get(j);
                        int currUserId=currUser.getId();
                        currUser.setId(currUserId-1);
                    }

                    try {
/*                        BufferedWriter br = new BufferedWriter(new FileWriter("diary\\src\\save.txt",false));
                        for (int j = 0; j <totalCount; j++) {
                            br.write("ID="+idList.get(j)+"&title="+titleList.get(j)+"&context="+textList.get(j));
                            br.newLine();
                        }
                        br.close();*/

                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("diary\\tablelist.data"));
                        oos.writeObject(userDataList);
                        oos.close();
                    }catch (IOException ioException){
                        ioException.printStackTrace();
                    }
                    showJDialog("删除成功");
                    this.setVisible(false);
                    new NoteJFrame();
                }else{
                    showJDialog("删除失败！");
                }

            }



        }else if(obj == exportItem){
            System.out.println("菜单的导出功能");
/*            Properties prop = new Properties();
            try {
                prop.load(new FileReader("diary\\zipPath.properties"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            String toPath = (String)prop.get("toPath");

            //将文件进行压缩
            File src =new File("D:\\JAVASE\\java-learn\\diary");
            File dest = new File(toPath);
            try {
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
                toZip(src,zos,"diary");
                zos.close();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }*/

            new ToZipThread().start();
            showJDialog("导出成功");

        }else if(obj == importItem){
            System.out.println("菜单的导入功能");
/*            Properties prop = new Properties();
            try {
                prop.load(new FileReader("diary\\zipPath.properties"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //获取压缩包路径和要解药到的路径
            String unZipPath = (String)prop.get("unPath");
            String toZipPath = (String)prop.get("toPath");
            try{
                ZipInputStream zis =new ZipInputStream(new FileInputStream(toZipPath));
                ZipEntry entry ;
                while((entry=zis.getNextEntry())!=null){
                    if(entry.isDirectory()){
                        File file =new File(unZipPath,entry.toString());
                        file.mkdirs();
                    }else{
                        File file = new File(unZipPath,entry.toString());
                        File entryParent = new File(file.getParent());
                        entryParent.mkdirs();
                        FileOutputStream fos =new FileOutputStream(file);
                        int b;
                        while((b=zis.read())!=-1){
                            fos.write(b);
                        }
                        fos.close();
                        zis.closeEntry();
                    }
                }
                zis.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }*/
            new UnZipThread().start();
            showJDialog("导入成功！");
        }
    }

/*
    //压缩操作
    public void toZip(File src, ZipOutputStream zos, String address){
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            File[] srcFiles = src.listFiles();
            for (File srcFile : srcFiles) {
                if(srcFile.isFile()){
                    try{
                        FileInputStream fis = new FileInputStream(srcFile);
                        ZipEntry entry = new ZipEntry(address + "\\" + srcFile.getName());
                        zos.putNextEntry(entry);
                        int b ;
                        while((b=fis.read())!=-1){
                            zos.write(b);
                        }
                        zos.closeEntry();
                        fis.close();
                    }catch (IOException ioe){
                        ioe.printStackTrace();
                    }
                }else{
                    toZip(srcFile,zos,address+"\\"+srcFile.getName());
                }
            }
        }else{
            try{
                FileInputStream fis = new FileInputStream(src);
                ZipEntry entry = new ZipEntry(address + "\\" + src.getName());
                zos.putNextEntry(entry);
                int b ;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                zos.closeEntry();
                fis.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }

    }
*/



    //初始化组件
    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);


        /*
         *从文件中读取数据，添加到表格中
         */

        try{
/*            BufferedReader br = new BufferedReader( new FileReader("diary\\src\\save.txt"));
            String line ;
            while((line=br.readLine())!=null){
                idList.add(line.split("&")[0].split("=")[1]);
                titleList.add(line.split("&")[1].split("=")[1]);
                textList.add(line.split("&")[2].split("=")[1]);

            }
            br.close();*/
            File dataFile = new File("diary\\tablelist.data");
            if(dataFile.exists() && dataFile.length()>0){
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("diary\\tablelist.data"));
                userDataList = (ArrayList<UserData>)ois.readObject();
                ois.close();
            }else{
                dataFile.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //记录一共有多少条记录
        int count = userDataList.size();
        System.out.println("一共有"+count+"条记录");

        //定义表格的标题
        Object[] tableTitles = {"编号", "标题", "正文"};
        //定义表格的内容
        //二维数组中的每一个一维数组，是表格里面的一行数据
        Object[][] tabledatas = new Object[count][3];
        int index=0;
        for (UserData userData : userDataList) {
            Object[] temp = {userData.getId(),userData.getTitle(),userData.getContext()};
            tabledatas[index] = temp;
            index++;
        }


        //定义表格组件
        //并给表格设置标题和内容
        table = new JTable(tabledatas, tableTitles);
        table.setBounds(40, 70, 504, 380);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40,70,504,380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230,230,230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212,212,212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();
    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if(!jDialog.isVisible()){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    /*
    *  作用：展示一个带有确定和取消按钮的弹框
    *
    *  方法的返回值：
    *       0 表示用户点击了确定
    *       1 表示用户点击了取消
    *       该弹框用于用户删除时候，询问用户是否确定删除
    * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？","删除信息确认",JOptionPane.YES_NO_OPTION);
    }
}
