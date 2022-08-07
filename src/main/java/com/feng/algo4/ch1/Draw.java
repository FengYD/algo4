package com.feng.algo4.ch1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @author fengyadong
 * @date 2022/8/6 22:42
 * @description
 */
public class Draw {

    public static void main(String[] args) {
        //new Draw().func();
        //new Draw().randomArray();
        new Draw().sortedRandomArray();
    }

    /**
     * 函数值
     * */
    public void func() {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    /**
     * 随机数组
     * */
    public void randomArray() {
        int N = 50;
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = StdRandom.random();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = array[i] / 2.0;
            double rw = 0.5 / N;
            double rh = array[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    /**
     * 排序的随机数组
     * */
    public void sortedRandomArray() {
        int N = 50;
        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = StdRandom.random();
        }
        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = array[i] / 2.0;
            double rw = 0.5 / N;
            double rh = array[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
