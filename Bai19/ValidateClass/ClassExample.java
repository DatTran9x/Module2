package Bai19.ValidateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String ACCOUNT_REGEX = "^[ABC][0-9]{4}[GHIKLM]";

    public ClassExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
