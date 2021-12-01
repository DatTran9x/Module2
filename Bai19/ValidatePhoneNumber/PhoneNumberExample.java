package Bai19.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String ACCOUNT_REGEX = "[(]\\d{1,2}[)][-][(][0]\\d{9}[)]";
    public PhoneNumberExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
