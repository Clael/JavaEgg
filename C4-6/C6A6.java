import java.util.Scanner;

public class C6A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String confirmacion;
        System.out.println("--------------------------");

        System.out.println("Ingrese dos numeros");
        System.out.println("Primer numero:");
        int num1 = sc.nextInt();
        sc.nextLine(); //
        System.out.println("Segundo numero:");
        int num2 = sc.nextInt();
        sc.nextLine(); //

        System.out.println("--------------------------");

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            confirmacion = "N";
            System.out.println("--------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1+num2));
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    System.out.println("--------------------------");
                    break;

                case 3:
                    System.out.println("El resultado de la multiplicación es :" + (num1*num2));
                    System.out.println("--------------------------");
                    break;

                case 4:
                    System.out.println("El resultado de la division es: " + (num1/num2));
                    System.out.println("--------------------------");
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    confirmacion = sc.nextLine();

                    if (confirmacion.equals("S")) {
                        System.out.println("La ejecución del programa finalizó");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    System.out.println("--------------------------");
                    break;
            }
        } while (confirmacion.equals("N"));

    }
}
