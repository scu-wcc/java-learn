package scu.wcc.doudizhu_exericse.domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //给牌定义属性
    //姓名
    private String name;

    //正反面
    private boolean up;

    //能否被点击
    private boolean canClick=false;

    //是否已经被点击
    private boolean clicked=false;

    public Poker(String name, boolean up){
        this.name = name;
        this.up=up;

        //将牌分为正面和反面的情况
        if(this.up){
            turnFront();
        }else{
            turnRear();
        }

        //设置牌的样式
        this.setSize(71,96);
        this.setVisible(true);

        //给每一张牌添加监听:参数this:调用该this里重写的方法
        this.addMouseListener(this);
    }


    //显示牌正面
    public void turnFront(){
        this.setIcon(new ImageIcon("basic_code/day24/image/poker/"+name+".png"));
        this.canClick=true;
        this.up=true;
    }

    //显示牌反面
    public void turnRear(){
        this.setIcon(new ImageIcon("basic_code/day24/image/poker/rear.png"));
        this.canClick=false;
        this.up=false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //点击事件
        if(canClick){
            //对牌当前的状态进行判断
            int step=0; //牌在y轴移动的像素
            if(clicked){
                //当前的牌已经被点击
                step=20;
            }else{
                //当前的牌没有被点击
                step=-20;
            }
            clicked=!clicked;
            //获取当前牌的位置
            Point from = this.getLocation();
            //设置牌结束时的位置
            Point to = new Point(from.x,from.y+step);
            //将最新的位置设置给牌
            this.setLocation(to);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
