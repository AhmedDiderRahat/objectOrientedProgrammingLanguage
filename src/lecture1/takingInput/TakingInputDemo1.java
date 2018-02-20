package lecture1.takingInput;

import java.util.Scanner;

/**
 *
 * @author AD_Rahat
 */
public class TakingInputDemo1 {

    public static void main(String args[]) {
        
        int x;
        System.out.print("Enter your Number: ");
        
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        
        System.out.println("The Number is: " + x);
    }
}
