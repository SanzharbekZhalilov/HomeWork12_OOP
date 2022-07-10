package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter triangle sides:");
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();

        System.out.println("Area of the triangle: " + triangle.findArea());

    }
}