package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class ByteArrayDemo {

    void byteArray() {
        byte ascii[] = {65, 66, 67, 68, 69};
        String s1 = new String(ascii);
        String s2 = new String(ascii, 1, 3);
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {

        ByteArrayDemo ob = new ByteArrayDemo();
        ob.byteArray();
    }
}
