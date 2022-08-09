package com.feng.algo4.ch2.basicsort;

/**
 * @author fengyadong
 * @date 2022/8/9 16:24
 * @Description
 */
public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && SortCommon.less(a[j], a[j-1]); j--) {
                SortCommon.exchange(a, j, j-1);
            }
        }
    }

}
