package lecture1.controlStatement;

/**
 *
 * @author AD-Rahat
 */
public class IfElseNestedDemo {

    public static void main(String args[]) {

        int a = 4, b = 3, c = 5;

        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
