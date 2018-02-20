package lecture3.overriding;

/**
 *
 * @author AD-Rahat
 */
class A {

    int i;

    A(int a) {
        i = a;
    }

    void show() {
        System.out.println(i);
    }
}

class B extends A {

    int j;

    B(int a, int b) {
        super(a);
        j = b;
    }

    void show() {
        super.show();
        System.out.println(j);
    }
}

public class OverridingDemo1 {

    public static void main(String[] args) {
        B ob = new B(10, 20);
        ob.show();
    }
}
