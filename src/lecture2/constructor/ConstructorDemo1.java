package lecture2.constructor;

/**
 *
 * @author AD-Rahat
 */
public class ConstructorDemo1 {

    int num;

    ConstructorDemo1() {
        num = 10;
    }
}

class ConstructorDemo2 {

    public static void main(String args[]) {
        
        ConstructorDemo1 ob = new ConstructorDemo1();
        System.out.println(ob.num);
    }
}
