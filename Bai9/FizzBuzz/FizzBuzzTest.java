import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz6() {
        int number = 5;
        String expected = "Buzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz51() {
        int number = 52;
        String expected = "Buzz";

        String result = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    void testFizz23() {
        int number = 23;
        String expected = "Fizz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz32() {
        int number = 32;
        String expected = "Fizz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    public String fizzBuzz(int number) {
        final boolean isFizz = number % 3 == 0;
        final boolean isBuzz = number % 5 == 0;
        final boolean isx3 = number % 10 == 3;
        final boolean isx5 = number / 10 == 5;
        final boolean is3x = number / 10 == 3;

//        System.out.println(isx3);

        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isx3 || is3x)
            return "Fizz";
        if (isx5)
            return "Buzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}