package lecture3.interfacePrograms;

/**
 *
 * @author AD-Rahat
 */
interface message {

    String msg = "Hello";

    void printMsg(String another_msg);
}

class A implements message {

    public void printMsg(String another_msg) {
        System.out.println(msg + "  " + another_msg);
    }
}

class InterfaceDemo1 {

    public static void main(String args[]) {
        
        A ob = new A();
        ob.printMsg("World");
    }
}