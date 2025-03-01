package scu.wcc.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jtb1 =new JButton("Print Button");
    JButton jtb2 =new JButton("Move Button");

    public MyJFrame(){
        this.setSize(600,500);
        this.setTitle("Button Test");
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);


        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);

        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);


        this.setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前操作的按钮对象
        Object source = e.getSource();
        if(source == jtb1){
            jtb1.setSize(200,150);
            jtb2.setBounds(200,150,100,50);
        }else if(source == jtb2){
            Random r = new Random() ;
            jtb2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        }

    }
}
