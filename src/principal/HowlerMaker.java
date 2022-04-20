package principal;

import java.io.*;

public class HowlerMaker {

    public static void run() {
        try (BufferedReader entrada = new BufferedReader(new FileReader("mail.txt"));
            BufferedWriter salida = new BufferedWriter(new FileWriter("howler.txt"))){
            String linea = entrada.readLine();
            while (linea != null) {
                salida.write(linea.toUpperCase());
                salida.newLine();
                linea = entrada.readLine();
            }
        } catch (IOException e) {
            System.out.println("Algo ha salido mal :(");

        }

    }

}