package scu.wcc.test;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        int[][] data = new int[4][4];

        for (int i = 1; i <= 16; i++) {
            list.add(i);
        }

        Random r = new Random();
        int len = list.size();
        for (int i = 0; i < len; i++) {
            int randomIndex = r.nextInt(len-i);
            data[i/4][i%4] = list.remove(randomIndex);
        }

    }
}
