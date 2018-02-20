package lecture2.overloading;

/**
 *
 * @author AD-Rahat
 */
public class ConstructorOverloadingDemo1 {

    int num;

    ConstructorOverloadingDemo1() {
        num = 10;
        System.out.println(num);
    }

    ConstructorOverloadingDemo1(int x) {
        num = x;
        System.out.println(num);
    }
}

class ConstructorOverloadingDemo1Main {

    public static void main(String args[]) {
        ConstructorOverloadingDemo1 ob1 = new ConstructorOverloadingDemo1();
        ConstructorOverloadingDemo1 ob2 = new ConstructorOverloadingDemo1(20);
        System.out.println(ob2.num);
    }
}
