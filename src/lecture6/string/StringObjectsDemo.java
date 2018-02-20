package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class StringObjectsDemo {

    void stringObjects() {
        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        String s1 = new String(ch);
        String s2 = new String(s1);
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {

        StringObjectsDemo ob = new StringObjectsDemo();
        ob.stringObjects();
    }
}