package com.feng.algo4.ch2;

import com.feng.algo4.ch2.basicsort.SortCommon;

/**
 * @author fengyadong
 * @date 2022/8/9 17:03
 * @Description
 */
public class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        System.arraycopy(a, lo, aux, lo, mid + 1);
        int i = 0;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= hi) {
            if (SortCommon.less(aux[i], a[j])) {
                a[k++] = aux[i++];
            } else {
                a[k++] = a[j++];
            }
        }
        if (i < mid) {
            while (i < mid) {
                a[k++] = aux[i++];
            }
        }
    }


    public static void main(String[] args) {

    }
}
