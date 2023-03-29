import java.util.Scanner;

public class C7A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        legalidad(edad, nombre);

    }

    public static void legalidad(int edad, String nombre) {

        if (edad >= 18) {
            System.out.println("Hola " + nombre + " usted es mayor de edad");
        } else {
            System.out.println("Hola " + nombre + " usted es menor de edad");
        }

    }
}
