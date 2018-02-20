package lecture6.IO;

import java.io.*;

/**
 *
 * @author AD-Rahat
 */
public class BuffreReaderDemo1 {

    public static void main(String args[]) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        char ch;
        do {
            ch = (char) br.read();
            System.out.println(ch);
        } while (ch != 'q');
    }
}
