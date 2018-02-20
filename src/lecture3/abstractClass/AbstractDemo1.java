package lecture3.abstractClass;

/**
 *
 * @author AD-Rahat
 */
abstract class sumFinder {

    abstract void sum(int a, int b);

    void anotherMethod() {
        System.out.println("This is another method.");
    }
}

public class AbstractDemo1 extends sumFinder {

    @Override
    void sum(int a, int b) {
        int s = a + b;
        System.out.println(s);
    }

    public static void main(String[] args) {
        AbstractDemo1 ob = new AbstractDemo1();
        ob.sum(10, 5);
        
        ob.anotherMethod();
    }
}
