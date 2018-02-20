package lecture2.classObject;

/**
 *
 * @author AD-Rahat
 */
public class ClassDemo1 {

    int sum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }
    
    public static void main(String[] args) {
        
        ClassDemo1 ob = new ClassDemo1();
        
        int s = ob.sum(5, 7);
        
        System.out.println("The sum is = " + s);
    }
}
