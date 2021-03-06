package principal;

import java.io.FileReader;
import java.io.IOException;

public class CountingVocals {
    private static String NOMBRE_TEXTO = "input.txt";
    private static String VOCALES = "aeiou";

    public static void run(boolean caseSensitive) {

        try {
            CharCounter contador = new CharCounter(VOCALES, caseSensitive);
            FileReader texto = new FileReader(NOMBRE_TEXTO);
            int c = texto.read();
            while ( c != -1 ) {
                contador.countIfTargeted((char) c);
                c = texto.read();
            }
            texto.close();
            System.out.println(contador);
        } catch (IOException ex) {
            System.out.println("Something bad has happended :-‐‐(");
        }
    }
}
