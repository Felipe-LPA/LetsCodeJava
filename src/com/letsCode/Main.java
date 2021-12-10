package com.letsCode;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] listInteiros = new int[10];
        listInteiros[0] = 10;
        listInteiros[4] = 5;
        listInteiros[7] = 8;

        for(int i = 0; i < listInteiros.length ; i++){
            if (listInteiros[i] > 0){
            System.out.printf("O valor da posição %d é: %d %n", i, listInteiros[i]);
            }
        }
        int[] copyList = Arrays.copyOfRange(listInteiros, 0, 3);
        System.out.println(Arrays.toString(copyList));

        boolean flag;
        Boolean outraflag;
    }
}
