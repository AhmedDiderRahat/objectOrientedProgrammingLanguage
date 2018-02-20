package lecture1.controlStatement;

/**
 *
 * @author AD-Rahat
 */
public class IfElseLeaderDemo {

    public static void main(String args[]) {
        int a = 100;
        if (a > 0) {
            System.out.println(a + " is Greater than Zero");
        } else if (a < 0) {
            System.out.println(a + " is Less than Zero");
        } else {
            System.out.println(a + " is Equal to Zero");
        }
    }
}
