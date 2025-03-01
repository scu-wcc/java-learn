package scu.wcc.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame4 extends JFrame implements ActionListener, MouseListener {
    JButton jtb =new JButton("按我，求你了");
    public MyJFrame4(){
        JFrameInit.initJFrame(this,500,450,"按钮测试");

        jtb.setBounds(0,0,100,50);
        jtb.addActionListener(this);
        jtb.addMouseListener(this);

        this.getContentPane().add(jtb);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("触发按钮！！！！");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标点击");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
