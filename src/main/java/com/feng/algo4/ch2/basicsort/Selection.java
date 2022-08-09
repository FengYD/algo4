package com.feng.algo4.ch2.basicsort;

/**
 * @author fengyadong
 * @date 2022/8/9 15:59
 * @Description
 */
public class Selection {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (SortCommon.less(a[j], a[min])) {
                    min = j;
                }
            }
            SortCommon.exchange(a, i, min);
        }
    }

}
