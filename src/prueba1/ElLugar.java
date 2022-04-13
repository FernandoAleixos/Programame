package prueba1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElLugar {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tec = new Scanner(new File("src/prueba1/direcciones.txt"));
        String direccion;
        int num;
        int arriba = 0;
        int izquierda = 0;
        int derecha = 0;

        while (tec.hasNext()) {
            direccion = tec.next();
            num = tec.nextInt();

            if (direccion.startsWith("a")) {
                arriba += num;
            } else if (direccion.startsWith("i")) {
                izquierda += num;
            } else if (direccion.startsWith("d")) {
                derecha += num;
            }
        }

        int horizontal = izquierda - derecha;
        int vertical = arriba;

        int resultado = horizontal * vertical;
        System.out.println(resultado);

    }
}
