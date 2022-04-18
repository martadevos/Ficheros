package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BackwardsWriter {
    private static String FILE_NAME = "backwards.txt";

    public static void run() {
        String text;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter a text: ");
            text = s.nextLine();
            FileWriter output = new FileWriter(FILE_NAME);
            for (int i = text.length() - 1; i >= 0; i--) {
                output.write(text.charAt(i));
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Something bad has happended :-‐‐(");
        }
    }
}

