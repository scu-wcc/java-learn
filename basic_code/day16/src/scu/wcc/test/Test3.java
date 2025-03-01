package scu.wcc.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame =new JFrame();
        jFrame.setSize(600,550);
        jFrame.setAlwaysOnTop(true);
        jFrame.setTitle("Button Test");
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //设置按钮
        JButton jtb1 = new JButton("Click me");
        jtb1.setBounds(0,0,100,50);

        //设置事件
        jtb1.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       System.out.println("You click the button!");
                                   }
                               }
        );

        jFrame.getContentPane().add(jtb1);

        jFrame.setVisible(true);
    }
}
