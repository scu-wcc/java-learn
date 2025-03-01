package scu.wcc.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    //监听鼠标事件
    JButton jtb = new JButton("点击按钮");

    public MyJFrame2(){
        JFrameInit.initJFrame(this,500,450,"拼图单机版");
        jtb.setBounds(0,0,100,50);
        //添加鼠标事件
        jtb.addMouseListener(this);

        this.getContentPane().add(jtb);
        this.setVisible(true);
    };

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开鼠标");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
