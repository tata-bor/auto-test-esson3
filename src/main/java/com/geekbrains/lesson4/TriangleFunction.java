package com.geekbrains.lesson4;

public class TriangleFunction {
    public double CalcTriangleArea(double a, double b, double c) {
        double S;
        double P;
        P = (a + b + c) / 2;
        S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        return S;
    }
}
