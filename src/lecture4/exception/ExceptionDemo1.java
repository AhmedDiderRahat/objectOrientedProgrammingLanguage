package lecture4.exception;

import java.util.*;

/**
 *
 * @author AD-Rahat
 */
class ExceptionDemo1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        try {
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Error.");
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai);
        }
    }
}
