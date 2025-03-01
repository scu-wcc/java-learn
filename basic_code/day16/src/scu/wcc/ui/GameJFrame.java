package scu.wcc.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][] data = new int[4][4];
    int[][] win =new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
    };

    int x = 0, y = 0;

    int count =0;

    String  accuracyImagePath ="";
    String animalPath = "day16/image/image/animal/";
    String womenPath = "day16/image/image/girl/";
    String sportPath = "day16/image/image/sport/";

    String[] allPath = {animalPath,womenPath,sportPath};



    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem weChatItem = new JMenuItem("公众号");

    JMenuItem womenItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    public GameJFrame() {
        //初始界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化图片顺序
        initData();

        //初始化图片
        setDefaultImagePath();
        initImage(accuracyImagePath);

        //设置窗口的显示
        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i % 4;
                y = i / 4;
            }

            data[i / 4][i % 4] = tempArr[i];
        }

    }

    private void initImage(String path) {
        //移除当前界面的图片
        this.getContentPane().removeAll();

        if(victory()){
            ImageIcon icon = new ImageIcon("day16/image/image/win.png");
            JLabel winJLabel = new JLabel(icon);
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        JLabel countJLabel = new JLabel(" 步数："+count);
        countJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(countJLabel);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int index = data[i][j];
                //创建ImageIcon对象，获取图片:找不到找不到16.jpg：使用空白代替
                ImageIcon icon = new ImageIcon(path + index + ".jpg");
                //将icon放入JLabel(管理容器)中
                JLabel jLabel = new JLabel(icon);
                //设置jLabel的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //设置边框JLabel.setBorder
                //BevelBorder:Border的实现类
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));

                //使用JFrame中的隐藏容器显示图片
                this.getContentPane().add(jLabel);
            }
        }

        //先加入的图片在上面，后加入的图片在下面
        ImageIcon background = new ImageIcon("day16/image/image/background.png");
        JLabel bgLabel = new JLabel(background);
        bgLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bgLabel);

        //重新印刷图片
        this.getContentPane().repaint();
    }


    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面的置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        //有四个常量：
        // DO_NOTHING_ON_CLOSE=0; 点击关闭后无反应；
        // HIDE_ON_CLOSE=1; 默认：点击关闭后隐藏；
        // DISPOSE_ON_CLOSE=2; 关闭全部窗口后停止程序；
        // EXIT_ON_CLOSE=3; 只要关闭一个窗口就停止程序；
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //将图片默认布局关闭
        this.setLayout(null);

        //对界面设置键盘监听
        this.addKeyListener(this);

    }

    private void initJMenuBar() {
        //创建整个菜单(bar)
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的选项(Menu)：创建对象时输入文本作为参数。
        JMenu newImageJMenu = new JMenu("更换图片");
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建对应选项上的条目(Item)：创建对象时输入文本作为参数。

        //分别添加
        newImageJMenu.add(womenItem);
        newImageJMenu.add(animalItem);
        newImageJMenu.add(sportItem);

        functionJMenu.add(newImageJMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(weChatItem);

        //给条目绑定事件
         replayItem.addActionListener(this);
         reLoginItem.addActionListener(this);
         closeItem.addActionListener(this);
         weChatItem.addActionListener(this);

         womenItem.addActionListener(this);
         animalItem.addActionListener(this);
         sportItem.addActionListener(this);



        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(victory()){
            return;
        }

        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            ImageIcon all = new ImageIcon(accuracyImagePath+"all.jpg");
            JLabel allJlabel = new JLabel(all);
            allJlabel.setBounds(83,134,420,420);
            this.getContentPane().add(allJlabel);

            ImageIcon background = new ImageIcon("day16/image/image/background.png");
            JLabel bgLabel = new JLabel(background);
            bgLabel.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bgLabel);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }

        int code = e.getKeyCode();

        if (code == 37) {
            System.out.println("向左移动");
            if(x == 0){
                return;
            }else{
                data[y][x] = data[y][x-1];
                data[y][x-1] =0;
                x--;
                count++;
                initImage(accuracyImagePath);
            }

        } else if (38 == code) {
            System.out.println("向上移动");
            if(y == 0){
                return;
            }else{
                data[y][x] = data[y-1][x];
                data[y-1][x] =0;
                y--;
                count++;
                initImage(accuracyImagePath);
            }


        } else if (39 == code) {
            System.out.println("向右移动");
            if(x == 3){
                return;
            }else{
                data[y][x] = data[y][x+1];
                data[y][x+1] =0;
                x++;
                count++;
                initImage(accuracyImagePath);
            }

        } else if (40 == code) {
            System.out.println("向下移动");
            if(y == 3){
                return;
            }else{
                data[y][x] = data[y+1][x];
                data[y+1][x] =0;
                y++;
                count++;
                initImage(accuracyImagePath);
            }
        }else if( 65 == code){
            // 重印图片
            initImage(accuracyImagePath);

        }else if(87 == code){
                data = win;
                x=3;
                y=3;
                initImage(accuracyImagePath);
            }
        }


    public boolean victory(){
        for (int i = 0; i < win.length; i++) {
            for (int j = 0; j < win[i].length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            //计步器清零
            count=0;
            //打乱数组
            initData();
            //重新加载
            initImage(accuracyImagePath);
        }else if(obj == reLoginItem){
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        }else if(obj == closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(obj == weChatItem){
            JDialog jDialog =new JDialog();
            JLabel jLabel =new JLabel(new ImageIcon("day16/image/image/about.png"));
            jDialog.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            //对弹窗进行设置
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭无法操作下面的界面
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }else if(obj == womenItem){
            System.out.println("美女图片");
            Random r = new Random();
            int index  = r.nextInt(13)+1;
            accuracyImagePath = womenPath+"girl"+index+"/";
            //打乱图片
            initData();
            initImage(accuracyImagePath);
        } else if (obj == animalItem) {
            System.out.println("动物图片");
            Random r = new Random();
            int index  = r.nextInt(8)+1;
            accuracyImagePath = animalPath+"animal"+index+"/";
            //打乱图片
            initData();
            initImage(accuracyImagePath);
        }else if(obj == sportItem){
            System.out.println("运动图片");
            Random r = new Random();
            int index  = r.nextInt(10)+1;
            accuracyImagePath = sportPath+"sport"+index+"/";
            //打乱图片
            initData();
            initImage(accuracyImagePath);
        }

    }

    public void setDefaultImagePath(){
        Random r = new Random();
        int index = r.nextInt(3);
        if(index == 0){
            int imageIndex = r.nextInt(8)+1;
            accuracyImagePath = allPath[index]+"animal"+imageIndex+"/";
        }else if(index == 1){
            int imageIndex = r.nextInt(13)+1;
            accuracyImagePath = allPath[index]+"girl"+imageIndex+"/";
        }else {
            int imageIndex = r.nextInt(10)+1;
            accuracyImagePath = allPath[index]+"sport"+imageIndex+"/";
        }
    }
}
