package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo1 {
    /*Crear, con un editor, un archivo de texto de números reales,
uno por línea. Abrirlo con un flujo de texto para lectura y leerlo línea a
línea. Convertir las cadenas leídas en número de tipo double por medio
de Scanner, y mostrar al final la suma de todos ellos.*/
    public static void leerNums() {
        BufferedReader lectura = null;
        double suma = 0;
        try {
            lectura = new BufferedReader(new FileReader("E1numeros.txt"));
            Scanner s = new Scanner(lectura);
            while (s.hasNextDouble()) {
                suma += s.nextDouble();
                lectura.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ha habido un problema con la lectura :(");
        } finally {
            try {
                if (lectura != null) {
                    lectura.close();
                }
            } catch (IOException e) {
                System.out.println("Ha habido un problema al cerrar el flujo :(");
            }
        }
        System.out.printf("La suma es %s", suma);
    }

}
