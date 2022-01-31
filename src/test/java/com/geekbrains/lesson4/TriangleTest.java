package com.geekbrains.lesson4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    @DisplayName("Проверка метода CalcTriangleArea")
    void RunCalcTriangleAreaMethodThenTrue(){
        TriangleFunction calculator = new TriangleFunction();
        double result = calculator.CalcTriangleArea(2,2,3);
        assertEquals(2.0, result, 0.02);
    }
}
