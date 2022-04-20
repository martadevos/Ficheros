package principal;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class CountingVocals2 {
    private static String NOMBRE_TEXTO2 = "input2.txt";

    public static void run(boolean caseSensitive) {
        try {
            CharCounter2 contador = new CharCounter2(caseSensitive);
            FileReader texto = new FileReader(NOMBRE_TEXTO2.toLowerCase(Locale.ROOT));
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
