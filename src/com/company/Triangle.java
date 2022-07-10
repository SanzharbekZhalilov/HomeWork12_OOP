package com.company;

public class Triangle {

    int a;
    int b;
    int c;

    double findArea() {
        double s = (double) (a+b+c)/2; // half of triangle perimeter
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // Heron's Formula
        return area;
    }
}