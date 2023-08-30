package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Швидкість автомобіля в кілометрах на годину");
        var speed = scanner.nextDouble();

        while (true) {
            System.out.println("Час в дорозі в годинах");
            var time = scanner.nextDouble();

            if (time == 0)
                break;

            var result = time * speed;
            System.out.println("Result = " + result);
        }
    }
}