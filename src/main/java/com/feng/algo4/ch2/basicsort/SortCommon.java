package com.feng.algo4.ch2.basicsort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author fengyadong
 * @date 2022/8/9 16:18
 * @Description
 */
public class SortCommon {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                SortCommon.exchange(a, j, j-1);
            }
        }
    }

    // less than (<)
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // exchange
    public static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // check sort
    public static boolean isSorted(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            if (!less(a[i-1], a[i])) {
                return false;
            }
        }
        return true;
    }

    // output to stdout
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
