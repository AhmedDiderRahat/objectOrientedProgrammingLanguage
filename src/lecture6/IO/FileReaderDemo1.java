package lecture6.IO;

import java.io.*;
import java.util.*;

/**
 *
 * @author AD-Rahat
 */
public class FileReaderDemo1 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");
            Scanner in = new Scanner(reader);
            PrintWriter out = new PrintWriter("output.txt");
            int lineNumber = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println("Line " + lineNumber + " : " + line);
                out.write(line+ "\n");
                lineNumber++;
            }
            out.close();
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }
}