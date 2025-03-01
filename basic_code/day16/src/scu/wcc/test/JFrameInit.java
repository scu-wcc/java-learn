package scu.wcc.test;

import javax.swing.*;

public class JFrameInit {

    private JFrameInit(){};
    public static void initJFrame(JFrame jFrame,int width,int height,String title){
        jFrame.setSize(width,height);
        jFrame.setTitle(title);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
    }

}
