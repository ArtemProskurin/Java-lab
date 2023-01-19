package Lab1;

import java.util.Scanner;

public class zadanie2 {
    void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.println("Задача 11:");

        double a, c, b, P, R;

        System.out.print("Введите катет AB: ");
        a = input.nextDouble();
        System.out.print("Введите гипотенузу AC: ");
        c = input.nextDouble();

        c = c * 100;
        b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
        P = a + b + c;

        System.out.println("Катет BC: "+b);
        System.out.println("Периметр треугольника: "+P);

        System.out.println("Задача 2:");

        int A, B, res;
        double b1;

        System.out.print("Введите число A: ");
        A = input.nextInt();
        System.out.print("Введите число B: ");
        B = input.nextInt();

        res = (A * 1024) + (B * 1024);
        A = (int) (A * Math.pow(1024,2));
        System.out.println("A = "+A+" байт");
        b1 = B * 0.0098;
        System.out.println("B = "+b1+" ГБ");
        System.out.println("Результат: "+res+" КБ");

        System.out.println("Задача 4");

        System.out.print("Введите угол a: ");
        a = input.nextDouble();
        System.out.print("Введите угол b: ");
        b = input.nextDouble();
        System.out.print("Введите угол c: ");
        c = input.nextDouble();
        System.out.print("Введите радиус R: ");
        R = input.nextDouble();

        a = 2 * R * Math.sin(a);
        b = 2 * R * Math.sin(b);
        c = 2 * R * Math.sin(c);

        System.out.println("Сторона А ="+a);
        System.out.println("Сторона B ="+b);
        System.out.println("Сторона C ="+c);

        System.out.println("Задача 13");

        int x1, x2, y1, y2;
        double resX, resY;

        System.out.print("Введите координату X1:");
        x1 = input.nextInt();
        System.out.print("Введите координату Y1:");
        y1 = input.nextInt();
        System.out.print("Введите координату X2:");
        x2 = input.nextInt();
        System.out.print("Введите координату Y2:");
        y2 = input.nextInt();

        resX = (x1 + x2) / 2;
        resY = (y1 + y2) / 2;

        System.out.println("Координаты середины отрезка: "+resX+";"+y2);
    }
}
