package Bai19.ValidateClass;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[] { "C0318G", "C0921K", "C1022K"};
    public static final String[] invalidClass = new String[] { "M0318G", "P0323A", "1234_", "abcde" };

    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String account : validClass) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidClass) {
            boolean isvalid = classExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
