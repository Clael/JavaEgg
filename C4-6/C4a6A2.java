import java.util.Scanner;

public class C4a6A2 {
    public static void main(String[] args) {
        System.out.println("Ingrese la palabra clave:");
        Scanner leer = new Scanner(System.in);

        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("La palabra ingresada es la correcta");
        } else {
            System.out.println("La palabra ingresada es incorrecta");
        }
    }
}
