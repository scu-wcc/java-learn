package scu.wcc.block_searchdemo;

import java.util.Scanner;

public class A01_demo1 {
    public static void main(String[] args){
        int[] arr= {5,11,14,21,18,
                29,31,45,34,42,
                48,60,57,51,
                69,71,66,88,79};

        //分块
        Block b1 = new Block(21,5,0,4);
        Block b2 = new Block(45,29,5,9);
        Block b3 = new Block(60,48,10,13);
        Block b4 = new Block(88,66,14,18);

        //建立索引表
        Block[] blocksArr = {b1,b2,b3,b4};
        System.out.println("请输入你要查找的数字：");
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.next());
        int result =  getIndex(blocksArr,arr,number);
        System.out.println(result);

    }

    public static int getIndex(Block[] blocksArr, int[] arr, int number) {
        int blockIndex=getBlockIndex(blocksArr,number) ;
        if(blockIndex ==-1){
            return -1;
        }
        int startIndex = blocksArr[blockIndex].getStartIndex();
        int endIndex = blocksArr[blockIndex].getEndIndex();
        for (int i = startIndex; i <=endIndex ; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int getBlockIndex(Block[] blocksArr,int number ){
        int len = blocksArr.length;
        for (int i = 0; i < len; i++) {
            int maxNumber = blocksArr[i].getMaxNumber();
            int minNumber = blocksArr[i].getMinNumber();
            if(number<=maxNumber && number>=minNumber){
                return i;
            }
        }
        return -1;
    }
}

class Block{
    private int maxNumber;
    private int minNumber;
    private int startIndex;
    private int endIndex;

    public Block(int maxNumber, int minNumber, int startIndex, int endIndex) {
        this.maxNumber = maxNumber;
        this.minNumber=minNumber;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }


    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }
}
