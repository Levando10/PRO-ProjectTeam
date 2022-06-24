
import java.util.Scanner;

public class Validation {
    private static final String PHONE_VALID = "^\\d{10}\\d*$";
    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Just input from " + min + " to " + max);
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Not Empty");
            } else {
                return result;
            }
        }
    }

    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email with format <account name> @ <domain>");
                System.out.print("Enter agian: ");
            }
        }
    }

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.out.println("Phone is number with minimum 10 character");
                System.out.print("Enter agian: ");
            }
        }
    }

    public static float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input number");
                System.out.print("Enter again:\n ");
            }
        }
    }

    public static int checkInputInteger() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input number");
                System.out.print("Enter again:\n ");
            }
        }
    }
}
