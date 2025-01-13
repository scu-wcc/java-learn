package scu.wcc.exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        double[] scores = getScores();

        double max = getMax(scores);
        double min = getMin(scores);
        double sum = getSum(scores);

        sum = sum - max - min;
        double avg = sum / (scores.length - 2);
        System.out.printf("该选手的得分是：%.3f", avg);
    }

    public static double[] getScores() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[6];
        while (count < scores.length) {
            System.out.println("请第" + (count + 1) + "位评委输入分数：");
            double score = sc.nextDouble();
            if (score >= 0 && score <= 100) {
                scores[count] = score;
                count++;
            } else {
                System.out.println("输入分数有误，请重新输入。");
            }
        }
        return scores;
    }

    public static double getMax(double[] arr) {
        double max = arr[0];
        for (double i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double getMin(double[] arr) {
        double min = arr[0];
        for (double i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static double getSum(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }
}
