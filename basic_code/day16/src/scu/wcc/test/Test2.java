package scu.wcc.test;

import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] tempArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        int[][] data =new int[4][4];

        for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4] = tempArr[i];
        }

    }
}
