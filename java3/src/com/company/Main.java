package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random key = new Random();
        int a[] = new int[]{7,4,10,1,8,2,6,3,5,9};
        int b[] = new int[]{8,3,1,9,6,2,4,10,7,5};
        System.out.println("Проверка Теоремы Ферма a^n + b^n = c^n,\n при n=2 и n>2:");
        System.out.println("Для проверки условия n=2 простым перебором вариантов\n возведем в квадрат произвольные целые числа и подставим в выражение:");
        int[] a2 = Arrays.copyOf(a, a.length);
        int[] b2 = Arrays.copyOf(b, b.length);
        double[] c = new double[10];
        int[] c2 = new int[10];
        for (int i = 0; i < 10; i++) {
            a2[i] = a[i] * a[i];
            b2[i] = b[i] * b[i];
            c2[i] = a2[i] + b2[i];
            c[i] = Math.sqrt(c2[i]);
            System.out.println(a[i] + "^2 + " + b[i] + "^2 = " + c[i] + "^2");
            System.out.println(a2[i] + " + " + b2[i] + " = " + c2[i] + "               Тут все правильно!\n");
        }

        System.out.println("При n=2 Выражение a^n + b^n = c^n верно.");
        System.out.println("Теперь пробуем при n>2:");
        int[] a3 = Arrays.copyOf(a, a.length);
        int[] b3 = Arrays.copyOf(b, b.length);
        int[] c3 = new int[10];
        for (int i = 0; i < 10; i++) {
            a3[i] = a[i] * a[i] * a[i];
            b3[i] = b[i] * b[i] * b[i];
            c3[i] = a3[i] + b3[i];
            System.out.println(a[i] + "^3 + " + b[i] + "^3 != " + c[i] + "^3");
            System.out.println(a3[i] + " + " + b3[i] + " = " + c3[i] + "               При n=3 выражение не верно!\n");
        }

        int[] a4 = Arrays.copyOf(a, a.length);
        int[] b4 = Arrays.copyOf(b, b.length);
        int[] c4 = new int[10];
        for (int i = 0; i < 10; i++) {
            a4[i] = a[i] * a[i] * a[i] * a[i];
            b4[i] = b[i] * b[i] * b[i] * b[i];
            c4[i] = a4[i] + b4[i];
            System.out.println(a[i] + "^4 + " + b[i] + "^4 != " + c[i] + "^4");
            System.out.println(a4[i] + " + " + b4[i] + " = " + c4[i] + "               При n=4 выражение не верно!\n");
        }

        int[] a5 = Arrays.copyOf(a, a.length);
        int[] b5 = Arrays.copyOf(b, b.length);
        int[] c5 = new int[10];
        for (int i = 0; i < 10; i++) {
            a5[i] = a[i] * a[i] * a[i] * a[i] * a[i];
            b5[i] = b[i] * b[i] * b[i] * b[i] * b[i];
            c5[i] = a5[i] + b5[i];
            System.out.println(a[i] + "^5 + " + b[i] + "^5 != " + c[i] + "^5");
            System.out.println(a5[i] + " + " + b5[i] + " = " + c5[i] + "               При n=5 выражение не верно!\n");
        }

        int[] a6 = Arrays.copyOf(a, a.length);
        int[] b6 = Arrays.copyOf(b, b.length);
        int[] c6 = new int[10];
        for (int i = 0; i < 10; i++) {
            a6[i] = a[i] * a[i] * a[i] * a[i] * a[i] * a[i];
            b6[i] = b[i] * b[i] * b[i] * b[i] * b[i] * b[i];
            c6[i] = a6[i] + b6[i];
            System.out.println(a[i] + "^6 + " + b[i] + "^6 != " + c[i] + "^6");
            System.out.println(a6[i] + " + " + b6[i] + " = " + c6[i] + "               При n=6 выражение не верно!\n");
        }

        int[] a7 = Arrays.copyOf(a, a.length);
        int[] b7 = Arrays.copyOf(b, b.length);
        int[] c7 = new int[10];
        for (int i = 0; i < 10; i++) {
            a7[i] = a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i];
            b7[i] = b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i];
            c7[i] = a7[i] + b7[i];
            System.out.println(a[i] + "^7 + " + b[i] + "^7 != " + c[i] + "^7");
            System.out.println(a7[i] + " + " + b7[i] + " = " + c7[i] + "               При n=7 выражение не верно!\n");
        }

        int[] a8 = Arrays.copyOf(a, a.length);
        int[] b8 = Arrays.copyOf(b, b.length);
        int[] c8 = new int[10];
        for (int i = 0; i < 10; i++) {
            a8[i] = a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i];
            b8[i] = b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i];
            c8[i] = a8[i] + b8[i];
            System.out.println(a[i] + "^8 + " + b[i] + "^8 != " + c[i] + "^8");
            System.out.println(a8[i] + " + " + b8[i] + " = " + c8[i] + "               При n=8 выражение не верно!\n");
        }

        int[] a9 = Arrays.copyOf(a, a.length);
        int[] b9 = Arrays.copyOf(b, b.length);
        int[] c9 = new int[10];
        for (int i = 0; i < 10; i++) {
            a9[i] = a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i];
            b9[i] = b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i];
            c9[i] = a9[i] + b9[i];
            System.out.println(a[i] + "^9 + " + b[i] + "^9 != " + c[i] + "^9");
            System.out.println(a9[i] + " + " + b9[i] + " = " + c9[i] + "               При n=9 выражение не верно!\n");
        }

        int[] a10 = Arrays.copyOf(a, a.length);
        int[] b10= Arrays.copyOf(b, b.length);
        int[] c10= new int[10];
        for (int i = 0; i < 10; i++) {
            a10[i] = a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i] * a[i];
            b10[i] = b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i] * b[i];
            c10[i] = a10[i] + b10[i];
            System.out.println(a[i] + "^10 + " + b[i] + "^10 != " + c[i] + "^10");
            System.out.println(a10[i] + " + " + b10[i] + " = " + c10[i] + "               При n=10 выражение не верно!\n");
        }
        System.out.println("Вывод: Выражение a^n + b^n = c^n является правильным только при n=2");

        System.out.println("Решение выражения: 1 - 1/2 + 1/3 - 1/4 + ... + 1/9999 - 1/10000:\n");
        double o = 0;
        double k = 1;
        while (k <= 10000) {
            k++;
            if (k % 2 == 0)
                o -= 1 / k;
            else
                o += 1 / k;
        }
        System.out.print("1 - 1/2 + 1/3 - 1/4 + ... + 1/9999 - 1/10000 = " +o);

    }
}