package prueba1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ElPan {

    public static void main(String[] args) throws FileNotFoundException {
        int primero;
        int siguienteNum;
        int contador = 0;
        int mayor;

        try {
            Scanner tec = new Scanner(new File("src/prueba1/harina.txt"));
            primero = tec.nextInt();

            while (tec.hasNext()) {
                siguienteNum = tec.nextInt();
                if (primero < siguienteNum) {
                    contador++;
                }
                primero = siguienteNum;
            }
            System.out.println(contador);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }
    }
}
