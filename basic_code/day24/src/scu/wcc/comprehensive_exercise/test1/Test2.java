package scu.wcc.comprehensive_exercise.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //有概率的点名
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,0,0,0,1,1,1,1,1,1,1);
        //System.out.println(list.size());
        Collections.shuffle(list);
        //System.out.println(list);

        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);


        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();

        Collections.addAll(boyList,"boy1","boy2","boy3","boy4","boy5","boy6","boy7");
        Collections.addAll(girlList,"girl1","girl2","girl3","girl4","girl5");


        if(number == 0){
            int girlIndex = r.nextInt(girlList.size());
            System.out.println(girlList.get(girlIndex));
        }else{
            int boyIndex = r.nextInt(boyList.size());
            System.out.println(boyList.get(boyIndex));
        }
    }
}
