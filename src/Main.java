import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double num1 = 0;
        double num2 = 0;

        //System.out es el objeto de salida estándar
        //System.in es el objeto de entrada estándar

        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Escribe el primer numero (diferente de cero): ");
            String cadenaNumero = teclado.nextLine();
            num1 = Double.parseDouble(cadenaNumero);
            System.out.print("Escribe el 2ndo numero: ");
            cadenaNumero = teclado.nextLine();
            num2 = teclado.nextDouble();
            System.out.println("La suma es: " + (num1 + num2));
        } catch (NumberFormatException excepcion) {
            System.out.println("Excepcion de cormato (parseDouble)");
        } catch (NumberFormatException excepcion)
        System.out.println("Excepcion de cormato (nextDouble)");

    }
        }
    }
