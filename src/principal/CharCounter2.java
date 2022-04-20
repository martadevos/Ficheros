package principal;

public class CharCounter2 {
    private boolean caseSensitive;
    private int contadorA=0;
    private int contadorE=0;
    private int contadorI=0;
    private int contadorO=0;
    private int contadorU=0;

    public CharCounter2(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }
    public void countIfTargeted(char c) {
        if (!caseSensitive) {
            c = Character.toLowerCase(c);
        }
        switch (c){
            case 'a' ->contadorA++;
            case 'e' ->contadorE++;
            case 'i' ->contadorI++;
            case 'o' ->contadorO++;
            case 'u' ->contadorU++;
        }
    }

    @Override
    public String toString() {
        return String.format("hay %s a, %s e, %s i, %s o, %s u en el texto",
                contadorA, contadorE, contadorI, contadorO, contadorU);
    }
}
