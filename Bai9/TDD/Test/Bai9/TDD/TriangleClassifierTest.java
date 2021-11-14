package Bai9.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTDD1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTDD2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTDD3() {
        int side1 = 2;
        int side2 = 4;
        int side3 = 5;
        String expected = "Tam giac thuong";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTDD4() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTDD5() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void testTDD6() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.testTDD(side1, side2, side3);
        assertEquals(expected, result);
    }
}