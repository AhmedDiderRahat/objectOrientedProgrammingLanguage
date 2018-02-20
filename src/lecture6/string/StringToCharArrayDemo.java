package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class StringToCharArrayDemo {

    void stringToCharArray() {
        String s = "This is a demo string";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }

    public static void main(String[] args) {

        StringToCharArrayDemo ob = new StringToCharArrayDemo();
        ob.stringToCharArray();
    }
}
