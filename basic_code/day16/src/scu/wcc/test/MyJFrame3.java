package scu.wcc.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    JButton jtb =new JButton("按钮");

    public MyJFrame3(){
        JFrameInit.initJFrame(this,500,450,"获取键盘事件");
//        jtb.addKeyListener(this);
//        jtb.setBounds(0,0,100,75);
//        this.getContentPane().add(jtb);

        //实际上应该对整个界面进行键盘监听
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("按住不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("松开键盘");
        int code =  e.getKeyCode();
        if(code == 37){
            System.out.println("左箭头");
        } else if (code==38) {
            System.out.println("上箭头");
        } else if (code == 39) {
            System.out.println("右箭头");
        } else if (code == 40) {
            System.out.println("下箭头");
        }
    }
}
