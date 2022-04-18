package principal;

import java.util.Locale;

public class CharCounter {

    private String busqueda;
    private boolean caseSensitive;
    private int contador=0;


    public CharCounter(String busqueda, boolean caseSensitive) {
        this.busqueda = busqueda;
        this.caseSensitive = caseSensitive;
    }


    public void countIfTargeted(char c) {
        for (int i = 0; i < busqueda.length(); i++) {
            if (busqueda.toLowerCase(Locale.ROOT).contains(Character.toString(c).toLowerCase(Locale.ROOT))) {
                contador++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("hay %s vocales en el texto", contador);
    }
}
