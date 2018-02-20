package lecture1.takingInput;

import java.util.Scanner;

/**
 *
 * @author AD-Rahat
 */
public class TakingInputDemo2 {

    public static void main(String args[]) {

        int n, x;
        int arr[] = new int[5];
        System.out.print("How many Number Your Want: ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the " + (i+1) + " Eelement : ");
            x = in.nextInt();
            arr[i] = x;
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
