import java.util.Scanner;

public class C4a6A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total = 0;

        do {
            System.out.println("Ingrese un numero:");
            num = sc.nextInt();
            total = total + num;
            if (num > 20 || total > 20) {
                System.out.println("El numero o la suma de los numeros ingresados supero el valor de 20");
            }
        } while (num < 20 || total < 20);

    }
}
