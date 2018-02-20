package lecture4.exception;

/**
 *
 * @author AD-Rahat
 */
public class ThrowsDemo {

    static void demoprocedure() throws IllegalAccessException {
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            demoprocedure();
        } catch (IllegalAccessException e) {
            System.out.println("Caught exception.");
        }
    }
}
