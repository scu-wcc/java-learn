package scu.wcc.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //设置窗口的显示
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置窗口的宽高
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面的置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initJMenuBar() {
        //创建整个菜单(bar)
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的选项(Menu)：创建对象时输入文本作为参数。
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu =new JMenu("关于我们");

        //创建对应选项上的条目(Item)：创建对象时输入文本作为参数。
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem =new JMenuItem("重新登录");
        JMenuItem closeItem =new JMenuItem("关闭游戏");

        JMenuItem weChatItem = new JMenuItem("公众号");

        //分别添加
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(weChatItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

    }
}
