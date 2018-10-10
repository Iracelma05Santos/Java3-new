package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{7,4,10,1,8,2,6,3,5,9};
        int b[] = new int []{8,3,1,9,6,2,4,10,7,5};
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
        System.out.println("Теперь пробуем при n>2:\n Будем подбирать числа и возводить в n>2 степень:");
        int num1=1;
        int num2=2;
        int n=2;
        for (int i = 0; i < 15; i++) {
            num1++;
            num2++;
            n++;
            double an = Math.pow(num1,2);
            double bn = Math.pow(num2,2);
            double res=an+bn;
            double sqres =Math.sqrt(res);
            System.out.println(" Сначала возводим в квадрат:");
            System.out.println(num1+"^2 + "+num2+"^2 = " +sqres+ "^2");
            double nr1=Math.pow(num1,n);
            double nr2=Math.pow(num2,n);
            double res2=nr1+nr2;
            System.out.println(num1+"^"+n+" + "+num2+"^"+n+" != " +sqres+ "^"+n);
            System.out.println(nr1+" + " +nr2+ " = " +res2+ "               При n>2 выражение не верно!\n");
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