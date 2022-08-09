package com.feng.algo4.ch2.basicsort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author fengyadong
 * @date 2022/8/9 16:29
 * @Description
 */
public class SortCompare {

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0d;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if (alg.equals("Shell")) {
            Shell.sort(a);
        }
        return timer.elapsedTime();
    }


    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        String alg3 = args[2];
        int N = Integer.parseInt(args[3]);
        int T = Integer.parseInt(args[4]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        double t3 = timeRandomInput(alg3, N, T);

        StdOut.println("Insertion " + t1);
        StdOut.println("Selection " + t2);
        StdOut.println("    Shell " + t3);
    }

}
