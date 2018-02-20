package lecture6.IO;

import java.io.*;

/**
 *
 * @author AD-Rahat
 */
public class BuffreReaderDemo2 {

    public static void main(String args[]) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter strings, 'stop' to quit.");
        String s;
        do {
            s = br.readLine();
            System.out.println(s);
        } while (!s.equals("stop"));
    }
}
