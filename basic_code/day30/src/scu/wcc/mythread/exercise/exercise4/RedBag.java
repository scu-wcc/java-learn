package scu.wcc.mythread.exercise.exercise4;


import java.lang.ref.PhantomReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RedBag extends  Thread{
    static BigDecimal money = BigDecimal.valueOf(100.0);
    static int count=3;
    //添加一个最小金额
    static final BigDecimal MIN =BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        synchronized (RedBag.class){

            if(count==0){
                System.out.println(getName()+"没抢到");

            }else if(count == 1 ){
                BigDecimal prize = money;
                System.out.println(getName()+"抢到了"+money+"元");
                count--;
            }else{

                Random r =new Random();
                //第一次和第二次抽取的时候，要考虑到后面红包的最小值0.01


                double bounds = money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                BigDecimal prize = BigDecimal.valueOf(r.nextDouble(bounds));
                prize=prize.setScale(2, RoundingMode.HALF_UP);

                if(prize.compareTo(MIN)==-1){
                    prize=BigDecimal.valueOf(MIN.doubleValue());
                }
                money=money.subtract(prize);


                System.out.println(getName()+"抢到了"+prize+"元");
                count--;
            }



        }
    }
}
