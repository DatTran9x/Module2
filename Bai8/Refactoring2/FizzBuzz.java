package Bai8.Refactoring2;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFuzz = number%3==0;
        boolean isBuzz = number%5==0;

        if(isFuzz && isBuzz)
            return "FizzBuzz";

        if(isFuzz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
