package lecture1.controlStatement;

/**
 *
 * @author AD-Rahat
 */
public class SwitchDemo {

    public static void main(String args[]) {
        
        int marks = 80;
        switch (marks) {
            case 80:
                System.out.println("A+");
                break;
            case 70:
                System.out.println("A");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
