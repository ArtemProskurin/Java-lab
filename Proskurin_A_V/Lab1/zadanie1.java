package Lab1;

import java.util.Scanner;

public class zadanie1 {
    void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №1");
        System.out.println("Математическое выражение №1");

        double a, x, e, y, z, res = 0;

        System.out.print("Введите a: ");
        a = input.nextDouble();
        System.out.print("Введите x: ");
        x = input.nextDouble();
        e = 0.001;

        res = (Math.sin(a) + Math.pow(Math.tan(x),2) * Math.pow(e,Math.abs(a))) / (Math.log(a) / Math.log(2));

        System.out.println("Результат: "+res);

        System.out.println("Математическое выражение №2");
        System.out.print("Введите x: ");
        x = input.nextDouble();
        System.out.print("Введите y: ");
        y = input.nextDouble();
        System.out.print("Введите z: ");
        z = input.nextDouble();

        res = Math.log(x + 7) * (x - (y / (z + (Math.pow(x,5) / 4))));
        System.out.println("Результат: "+res);
    }
}
