package com.tekwill.learning.hw;

public class StatementsTasks {
    public static void main(String[] args) {
        // a
        int[] f = new int[7];
        f[0] = 3;
        f[1] = 3;
        f[2] = 4;
        f[3] = 4;
        f[4] = 4;
        f[5] = 10;
        f[6] = 10;

        System.out.println("Value of element 6 is " + f[5]);

        // b
        int[] g = {8, 8, 8, 8, 8};
        System.out.println(g[3]);

        // c
        float[] c = new float[100];
        float total = 0.0f;

        for (int i = 0; i < c.length; i++) {
            c[i] = (float) i;
        }

        for (float v : c) {
            total += v;
        }

        System.out.println("Total is " + total);

        // d
        int[] a = new int[11];
        int[] b = new int[34];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.arraycopy(a, 0, b, 0, a.length);

        for(int i = 0; i < 11; i++) {
            System.out.println(b[i]);
        }

        // e
        float[] w = new float[99];

        for(int i = 0; i < w.length; i++) {
            w[i] = (float) i;
        }

        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;

        for (float v : w) {
            if (v > min) max = v;
            if (v < max) min = v;
        }

        System.out.println("max - " + max + ", min - " + min);
    }
}
