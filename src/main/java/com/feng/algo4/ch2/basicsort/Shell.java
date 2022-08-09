package com.feng.algo4.ch2.basicsort;

/**
 * @author fengyadong
 * @date 2022/8/9 16:46
 * @Description
 */
public class Shell {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortCommon.less(a[j], a[j-h]); j -= h) {
                    SortCommon.exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }


}
