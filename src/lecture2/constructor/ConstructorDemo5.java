package lecture2.constructor;

/**
 *
 * @author AD-Rahat
 */
public class ConstructorDemo5 {

    int num;

    ConstructorDemo5(int num) {
        this.num = num;
    }
}

class ConstrucotrDemo6 {

    public static void main(String args[]) {
        ConstrucotrDemo3 ob1 = new ConstrucotrDemo3(10);
        System.out.println(ob1.num);
    }
}
