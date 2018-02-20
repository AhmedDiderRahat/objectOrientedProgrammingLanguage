package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class CharacterArrayStringsDemo {

    void characterArrayStrings() {
        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        String s = new String(ch);
        System.out.println(s);
    }

    public static void main(String[] args) {

        CharacterArrayStringsDemo ob = new CharacterArrayStringsDemo();
        ob.characterArrayStrings();
    }
}
