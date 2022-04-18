package com.zadania.Cwiczenia;

import java.util.Arrays;

public class Cw_004_Arrays {
    public static void main(String[] args) {
        float[] floats = new float[10];
        floats[0] = 413222232;
        floats[1] = 267899;
        floats[2] = 9876319;
        floats[3] = 95973356;
        floats[4] = 13126709;
        floats[5] = 68097;
        floats[6] = 861111111;
        floats[7] = 999999999;
        floats[8] = 413222232;
        floats[9] = 413228765;

        Arrays.sort(floats);
        System.out.println();
        for (float i : floats) {
            System.out.print(i+" ");
        }
    }
}
