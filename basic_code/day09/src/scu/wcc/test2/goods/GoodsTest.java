package scu.wcc.test2.goods;

public class GoodsTest {
    public static void main(String[] args){
        Goods[] goodsArr = new Goods[3];
        Goods goods1 = new Goods("001","苹果15pro",9899.0,60);
        Goods goods2 = new Goods("002","联想笔记本",7799.0,10);
        Goods goods3 = new Goods("003","蝰蛇鼠标",199.0,90);

        goodsArr[0] = goods1;
        goodsArr[1] = goods2;
        goodsArr[2] = goods3;

        for (int i = 0; i < goodsArr.length; i++) {
            Goods goods = goodsArr[i];
            System.out.println(goods.getID()+"，"+goods.getName()+"，"+goods.getPrice()+"，"+goods.getCount());
        }
    }
}
