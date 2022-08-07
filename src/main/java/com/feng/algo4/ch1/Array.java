package com.feng.algo4.ch1;

/**
 * @author fengyadong
 * @date 2022/8/7 14:14
 * @description 数组
 */
public class Array {

    public static void main(String[] args) {
        double[] array = {0.12, 2.9, 5.4, 100.2};
        System.out.println("findMaxValue = " + new Array().findMaxValue(array));
        System.out.println("getAvgFromArray = " + new Array().getAvgFromArray(array));
    }

    /**
     * 找到数组中的最大值
     * @param array 数组
     * */
    public double findMaxValue(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 计算数组平均值
     * @param array 数组
     * */
    public double getAvgFromArray(double[] array) {
        int N = array.length;
        double sum = 0d;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        return sum / N;
    }

}
