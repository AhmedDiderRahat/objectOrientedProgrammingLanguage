package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class StringCompareDemo {

    void stringCompare() {
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    public static void main(String[] args) {

        StringCompareDemo ob = new StringCompareDemo();
        ob.stringCompare();
    }
}
