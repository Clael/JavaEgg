import java.util.Scanner;
import java.util.Vector;

public class C9A3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int num= sc.nextInt();

        int[] vector=new int[num];
        int j=0; //1 cifra
        int q=0; //2 cifra
        int k=0; //3 cifra
        int a=0; //4 cifra
        int b=0; //5 cifra

        for (int i=0; i<num;i++) {
            vector[i]=(int)(Math.random()*10000+1);

            if (vector[i]>0 && vector[i]<10){
                j++;
            }
            if (vector[i]>9 && vector[i]<100){
                 q++;
            }
            if (vector[i]>99 && vector[i]<1000){
                k++;
            }
           if (vector[i]>999 && vector[i]<10000){
                a++;
            }
            if (vector[i]>9999 && vector[i]<100000){
                b++;
            }
        }
        System.out.println("La cantidad de numeros que hay según la cantidad de cifras: "); 
        System.out.println("1 cifra: "+j);
        System.out.println("2 cifra: "+q);
        System.out.println("3 cifra: "+k);
        System.out.println("4 cifra: "+a);
        System.out.println("5 cifra: "+b);

        sc.close();

    }
}
