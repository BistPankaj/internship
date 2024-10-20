
import java.util.Scanner;

public class Task2 {
    /* this is the Password Strength Checker project */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE PASSWORD : ");
        String password = sc.nextLine();
        sc.close();
        String strength = chekstrengthPassword(password);
        System.out.println(strength);

    }

    public static String chekstrengthPassword(String password) {
        int length = 8;
        boolean Uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;
        String specialCharacter = "!@#$%^&*()_+{}[]|:;,.<>?~";
        // check the length of password
        if (password.length() >= length) {
            // check other
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    Uppercase = true;

                } else if (Character.isLowerCase(ch)) {
                    lowercase = true;

                } else if (Character.isDigit(ch)) {
                    digit = true;

                } else if (specialCharacter.contains(String.valueOf(ch))) {
                    special = true;

                }
            }
            // analze the Strength of Password
            if (Uppercase && lowercase && digit && special) {
                return "This Password is very Strong Password";
            } else {
                return "it is weak Password please try to Strong Password";
            }
        } else {
            return "The Password Length Must Be " + length;
        }

    }
}
