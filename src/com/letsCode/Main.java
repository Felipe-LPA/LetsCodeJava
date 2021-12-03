package com.letsCode;

public class Main {
    public static void main(String[] args) {
        int num1 = Num(2, 3);
        int num2 = 2;
        String name = "çAÃsPsdí";
        String name1 = null;
        System.out.println(name);
        float nota = 7.0F;
        if (num2 == num1) {
            String alguma = "coisa";
            System.out.println(alguma);
        }
        final int QUANTIDADE_TENTATIVAS = 0;
        System.out.println(QUANTIDADE_TENTATIVAS);
        /*float pi = Float.parseFloat(Math.PI);*/
        float pi1 = (float) (Math.PI);
        System.out.println(pi1);
        WeekDays monday = WeekDays.monday;
        System.out.println(monday);
        System.out.println(WeekDays.tuesday.number);

    }

    static int Num(int num1, int num2) {
        return num1 + num2;
    }

    float Flo(float num1, float num2) {
        return num1 + num2;
    }

public enum WeekDays {
    monday(1), tuesday(2), wednesday(3), thursday(4), friday(5), saturday(6), sunday(7);
    private final int number;
    WeekDays(int valor){
        number = valor;
    }
    }

}
