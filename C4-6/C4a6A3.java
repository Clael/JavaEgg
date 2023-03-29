import java.util.Scanner;

public class C4a6A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra o frase de 8 caracteres de largo:");
        String frase = sc.nextLine();
        String fraseSinEspacio = frase.replace(" ", "");
        int largo = fraseSinEspacio.length();

        if (largo == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
