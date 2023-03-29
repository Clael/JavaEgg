
import java.util.Scanner;

public class C1A4 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese los grados C:");
        int C = sc.nextInt();
        int F = 32+(9*C/5);
    System.out.println(C+"° centigrados convertidos a Fahrenheit son °"+F);
        
    }
}
