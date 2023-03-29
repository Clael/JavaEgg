import java.util.Scanner;

public class C4a6A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra que inicie con A:");
        String frase = sc.nextLine();
        String primeraLetra = frase.substring(0, 1);

        if (primeraLetra.equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("La primera letra no es A");
        }

    }
}
