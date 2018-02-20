package lecture6.string;

/**
 *
 * @author AD-Rahat
 */
public class StringConcatanationDemo {

    void stringConcatanation() {
        String s1 = "Hello " + "World " + 2013;
        String s2 = "abc".concat("def");
        System.out.println(s1 + "\n" + s2);
    }

    public static void main(String[] args) {

        StringConcatanationDemo ob = new StringConcatanationDemo();
        ob.stringConcatanation();
    }
}
