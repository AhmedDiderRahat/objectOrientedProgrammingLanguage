package lecture4.exception;

import java.util.*;

/**
 *
 * @author AD-Rahat
 */
public class ExceptionDemo2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        try {
            int b = 42 / a;
            try {
                if (a == 1) {
                    a = a / (a - a);
                } else {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println(ai);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Error.");
        }
    }
}
