package lecture2.overloading;

/**
 *
 * @author AD-Rahat
 */
public class MethodOverloadingDemo1 {

    int num;

    void test() {
        System.out.println("No Parameters");
    }

    void test(int a) {
        System.out.println(a + " one Parameters");
    }

    void test(double a) {
        System.out.println(a + " Double Parameters");
    }
}

class MethodOverloadingDemo1Call {

    public static void main(String args[]) {
        
        MethodOverloadingDemo1 ob1 = new MethodOverloadingDemo1();
        ob1.test();
        ob1.test(10);
        ob1.test(10.101);
    }
}
