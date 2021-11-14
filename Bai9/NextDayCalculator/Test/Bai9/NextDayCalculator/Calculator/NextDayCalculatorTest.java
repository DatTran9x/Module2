package Bai9.NextDayCalculator.Calculator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void calculator() {
        int ngay = 1;
        int thang = 1;
        int nam = 2018;
        int[] expected = {2,1,2018};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void calculator1() {
        int ngay = 31;
        int thang = 1;
        int nam = 2018;
        int[] expected = {1,2,2018};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void calculator2() {
        int ngay = 30;
        int thang = 4;
        int nam = 2018;
        int[] expected = {1,5,2018};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void calculator3() {
        int ngay = 29;
        int thang = 2;
        int nam = 2018;
        int[] expected = {1,3,2018};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void calculator4() {
        int ngay = 28;
        int thang = 2;
        int nam = 2020;
        int[] expected = {29,2,2020};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void calculator5() {
        int ngay = 31;
        int thang = 12;
        int nam = 2018;
        int[] expected = {1,1,2019};
        int[] input = {ngay,thang,nam};

        int[] result = NextDayCalculator.calculator(input);
        assertArrayEquals(expected, result);
    }
}