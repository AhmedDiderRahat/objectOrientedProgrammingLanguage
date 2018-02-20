package lecture1.arrays;

/**
 *
 * @author AD-Rahat
 */
public class ArrayDemoSumOfElements {

    public static void main(String args[]) {

        int arr[] = new int[5];
        arr[0] = 25;
        arr[1] = 12;
        arr[2] = 56;
        arr[3] = 43;
        arr[4] = 32;

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        System.out.println("SUM = " + sum);
    }
}
