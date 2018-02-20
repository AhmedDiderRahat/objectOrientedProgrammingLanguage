package lecture2.classObject;

/**
 *
 * @author AD-Rahat
 */
public class ClassDemo3 {

    int printMessage(int x) {
        int a = x;
        return a;
    }
}

class methodDisplayer {

    public static void main(String args[]) {
        int num1, num2, num3;

        ClassDemo3 ob1 = new ClassDemo3();
        num1 = ob1.printMessage(10);
        System.out.println(num1);

        ClassDemo3 ob2 = new ClassDemo3();
        num2 = ob2.printMessage(20);
        System.out.println(num2);

        ClassDemo3 ob3 = new ClassDemo3();
        num3 = ob3.printMessage(30);
        System.out.println(num3);
    }
}
