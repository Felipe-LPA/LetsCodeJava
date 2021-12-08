package com.letsCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    boolean par = 4 % 2 == 0;
//        String name = "Felipe";
//        int idade = 23;
//        float altura = 1.70f;
//        int[] numbers = {1, 2, 3, 4};
//
//
//        System.out.printf("%d", numbers[1]);
//        System.out.printf("%15s%n",name);
//        System.out.printf("%10.2s %n%n", "Hi there!");
////        System.out.printf("%s", args[0]);
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe o nome: ");
//        String name3 = sc.next();
//        System.out.printf("O nome informado foi %s", name3);
//        System.out.println("Informe sua Idade");
//        int idade1 = sc.nextInt();
        System.out.print("Digite o valor em Real que deseja converver para Dolar/Euro:");
        double real = sc.nextDouble();

//        System.out.println();

        ConvertReal(real);
    }

    private static void ConvertReal(double valor){
        final double dolar = 5.65;
        final double euro = 6.39;
        System.out.printf("O valor %.2f BRL fica %.2f USD e %.2f EUR", valor, valor/dolar, valor/euro);
    }
}
