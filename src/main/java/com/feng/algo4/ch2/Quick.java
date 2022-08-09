package com.feng.algo4.ch2;

import com.feng.algo4.ch2.basicsort.SortCommon;

/**
 * @author fengyadong
 * @date 2022/8/9 17:04
 * @Description
 */
public class Quick {

    public static void sort(Comparable[] a) {

    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (SortCommon.less(a[++i], v)) {
                if (i == hi)
                    break;
            }
            while (SortCommon.less(v, a[--j])) {
                if (j == lo)
                    break;
            }
            if (i >= j) {
                break;
            }
            SortCommon.exchange(a, i, j);
        }
        return j;
    }

}
