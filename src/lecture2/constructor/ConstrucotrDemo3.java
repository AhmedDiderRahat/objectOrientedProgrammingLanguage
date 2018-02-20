package lecture2.constructor;

/**
 *
 * @author AD-Rahat
 */
public class ConstrucotrDemo3 {

    int num;

    ConstrucotrDemo3(int x) {
        num = x;
    }
}

class ConstrucotrDemo4 {

    public static void main(String args[]) {
        ConstrucotrDemo3 ob1 = new ConstrucotrDemo3(10);
        ConstrucotrDemo3 ob2 = new ConstrucotrDemo3(20);
        System.out.println(ob1.num);
        System.out.println(ob2.num);
    }
}
