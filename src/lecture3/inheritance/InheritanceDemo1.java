package lecture3.inheritance;

/**
 *
 * @author AD-Rahat
 */
class A {

    int i, j;

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {

    int k;

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class InheritenceDemo1 {

    public static void main(String args[]) {
        B ob = new B();
        ob.i = 10;
        ob.j = 20;
        ob.k = 30;
        ob.show();
        ob.sum();
    }
}
