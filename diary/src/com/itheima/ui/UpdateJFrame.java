package com.itheima.ui;

import domain.UserData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class UpdateJFrame extends JFrame implements ActionListener {

    int index;

    //定义标题输入框
    JTextField titleText  = new JTextField();

    //定义内容的输入区域
    JTextArea contentText = new JTextArea();

    //定义修改按钮
    JButton update = new JButton("修改");

    //定义取消按钮
    JButton cancel = new JButton("取消");

    public UpdateJFrame(int index){
        //记录要修改的记录
        this.index=index;

        //初始化界面
        initFrame();

        //初始化组件
        initView();

        //让界面展示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == update){
            System.out.println("修改按钮被点击了");
            String title = titleText.getText();
            String text = contentText.getText();

            if(title.isEmpty()&&text.isEmpty()){
                this.setVisible(false);
                new NoteJFrame();
                return;
            }

            //读取内容
            ArrayList<UserData> userList = new ArrayList<>();

            try{
/*                BufferedReader br = new BufferedReader( new FileReader("diary\\src\\save.txt"));
                String line ;
                while((line=br.readLine())!=null){
                    idList.add(line.split("&")[0].split("=")[1]);
                    titleList.add(line.split("&")[1].split("=")[1]);
                    textList.add(line.split("&")[2].split("=")[1]);
                    count++;
                }
                br.close();*/

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("diary\\tablelist.data"));
                userList = (ArrayList<UserData>)ois.readObject();
                ois.close();

            }catch (IOException ioe){
                ioe.printStackTrace();
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            String currTitle = userList.get(index).getTitle();
            String currText = userList.get(index).getContext();
            titleText.setText(currTitle);
            contentText.setText(currText);


            if(title.isEmpty() && !text.isEmpty()){
                //修改内容
                userList.get(index).setContext(text);

            }else if(!title.isEmpty() && text.isEmpty()){
                //修改标题
                userList.get(index).setTitle(title);

            }else if(!title.isEmpty()&& !text.isEmpty()){
                //都修改
                userList.get(index).setContext(text);
                userList.get(index).setTitle(title);
            }

            //将数据写回文件中
            try {
/*                BufferedWriter br = new BufferedWriter(new FileWriter("diary\\src\\save.txt",false));
                for (int i = 0; i < count; i++) {
                    br.write("ID="+(idList.get(i))+"&title="+titleList.get(i)+"&context="+textList.get(i));
                    br.newLine();
                }
                br.close();*/
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("diary\\tablelist.data"));
                oos.writeObject(userList);
                oos.close();

            }catch (IOException ioException){
                ioException.printStackTrace();
            }

            this.setVisible(false);
            new NoteJFrame();


        }else if(obj == cancel){
            System.out.println("取消按钮被点击了");
            this.setVisible(false);
            new NoteJFrame();
        }
    }

    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义文字：标题
        JLabel subject = new JLabel("标题");
        subject.setBounds(70,90,100,30);
        subject.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(subject);

        //定义文字：内容
        JLabel content = new JLabel("内容");
        content.setBounds(70,140,100,30);
        content.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(content);


        //设置标题的输入框
        titleText.setBounds(120,90,426,30);
        titleText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(titleText);

        //设置内容的输入框
        contentText.setBounds(120,140,426,300);
        contentText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(contentText);

        //设置保存按钮
        update.setBounds(132,466,140,40);
        update.setFont(new Font("宋体",Font.PLAIN,24));
        update.addActionListener(this);
        this.getContentPane().add(update);

        //设置取消按钮
        cancel.setBounds(312,466,140,40);
        cancel.setFont(new Font("宋体",Font.PLAIN,24));
        cancel.addActionListener(this);
        this.getContentPane().add(cancel);



        //--------------------------------------------------------------------------------------------------------------
        ArrayList<UserData> userList = new ArrayList<>();

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("diary\\tablelist.data"));
            userList = (ArrayList<UserData>)ois.readObject();
            ois.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        String currTitle = userList.get(index).getTitle();
        String currText = userList.get(index).getContext();
        titleText.setText(currTitle);
        contentText.setText(currText);

        //--------------------------------------------------------------------------------------------------------------

    }


    //对添加界面的一些设置
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记（添加日记）");
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
}
