package Test.TestThucHanh.Controller;

import Test.TestThucHanh.View.GetAndAlert;

import java.util.Scanner;

public class Validate {
    GetAndAlert getAndAlert = new GetAndAlert();
    Scanner scanner =new Scanner(System.in);

    public double validateDouble() {
        try {
            double number = Double.parseDouble(scanner.nextLine());
            if (number < 0) {
                getAndAlert.alertNumber();
                return validateDouble();
            }
            return number;
        } catch (Exception e) {
            getAndAlert.alertNumber();
            return validateDouble();
        }
    }

    public int validateInteger() {
        try {
            String word = scanner.nextLine();
            if(word.equals("")){
                return -1;
            }
            int number = Integer.parseInt(word);
            if (number < 0) {
                getAndAlert.alertNumber();
                return validateInteger();
            }
            return number;
        } catch (Exception e) {
            getAndAlert.alertNumber();
            return validateInteger();
        }
    }
}
