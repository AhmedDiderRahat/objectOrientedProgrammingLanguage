package lecture2.classObject;

/**
 *
 * @author AD-Rahat
 */
public class ClassDemo2 {

    int result;

    void sum(int a, int b) {

        result = a + b;
        System.out.println("SUM = " + result);
    }

    public static void main(String[] args) {

        ClassDemo2 ob = new ClassDemo2();
        ob.sum(5, 7);
    }
}
