import java.util.Scanner;

public class C7A1 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = sc.nextInt();
        System.out.println("--------------------");
        System.out.println("Que desea hacer?");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int operacion = sc.nextInt();
        System.out.println("--------------------");

        if (operacion == 1) {
            System.out.println("El resultado de la suma es: " + suma(num1, num2));
        }
        if (operacion == 2) {
            System.out.println("El resultado de la resta es: " + resta(num1, num2));
        }
        if (operacion == 3) {
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion(num1, num2));
        }
        if (operacion == 4) {
            System.out.println("El resultado de la division es: " + division(num1, num2));
        }

    }

    public static int suma(int num1, int num2) {
        int resultadoSuma;
        resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

    public static int resta(int num1, int num2) {
        int resultadoResta;
        resultadoResta = num1 - num2;
        return resultadoResta;
    }

    public static int multiplicacion(int num1, int num2) {
        int resultadoMultiplicacion;
        resultadoMultiplicacion = num1 * num2;
        return resultadoMultiplicacion;
    }

    public static int division(int num1, int num2) {
        int resulttadoDivision;
        resulttadoDivision = num1 / num2;
        return resulttadoDivision;
    }

}
