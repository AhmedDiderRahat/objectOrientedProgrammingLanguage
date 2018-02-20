package lecture4.exception;

import java.util.*;

/**
 *
 * @author AD-Rahat
 */
class ColdException extends Exception {

    ColdException(String msg) {
        super(msg);
    }
}

class HotException extends Exception {

    HotException(String msg) {
        super(msg);
    }
}

class ThrowDemo {

    int takeNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void main(String args[]) {
        ThrowDemo ob = new ThrowDemo();
        int x = ob.takeNumber();
        if (x < 20) {
            try {
                throw new ColdException("Too Cold!");
            } catch (ColdException e) {
                e.printStackTrace();
            }
        } else if (x > 35) {
            try {
                throw new HotException("Too Hot!");
            } catch (HotException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Nice Temperature");
        }
    }
}
