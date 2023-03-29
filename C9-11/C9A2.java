import java.util.Scanner;

public class C9A2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el largo de su vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("Que numero desea buscar en el vector:");
        int numBuscar = leer.nextInt();
        System.out.print("El numero " + numBuscar + " se encuentra en la posicion ");
        for (int i = 0; i < n; i++) {
            if (numBuscar == vector[i]) {
                System.out.print((i + 1) + " ");
            }
            
        }
        System.out.print("del vector");
    }
}
