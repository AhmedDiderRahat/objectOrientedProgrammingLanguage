package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class StringLengthDemo {

    void stringLength() {
        int len;
        String s = "Hello";
        len = s.length();
        System.out.println(len);
    }

    public static void main(String[] args) {

        StringLengthDemo ob = new StringLengthDemo();
        ob.stringLength();
    }
}
