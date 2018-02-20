package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class TrimingDemo {

    void trimingMethod() {
        String s = "    Hello    World	 ".trim();
        System.out.println(s);
    }

    public static void main(String[] args) {

        TrimingDemo ob = new TrimingDemo();
        ob.trimingMethod();
    }
}
