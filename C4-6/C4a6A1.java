import java.util.Scanner;

public class C4a6A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero que quiera saber si es par o no");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("El numero ingresado es impar");

        } else {
            System.out.println("El numero ingresado es par");
        }
    }
}

