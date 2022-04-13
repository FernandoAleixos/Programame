package prueba1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ingredientes {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner tec = new Scanner(new File("src/prueba1/ingredientes.txt"));
        int numZeros = 0;
        int numUnos = 0;
            String num = tec.nextLine();
            for (int i = 0; i < 12; i++) {
                if (num.charAt(i) == '0') {
                    numZeros++;
                } else {
                    numUnos++;
                }
                System.out.println("El " + i + " " + numZeros + " " + numUnos);
            }
    }
}
