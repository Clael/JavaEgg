

import java.util.Scanner;

public class C1A1 {

    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros");

        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resultado = num1 + num2;

        System.out.println("La suma del numero " + num1 + " y el numero " + num2 + " da como resultado: " + resultado);

    }

}
