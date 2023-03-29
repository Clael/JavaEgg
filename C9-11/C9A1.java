import java.util.Scanner;

public class C9A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }
}
/*
 * main(String[] args) {
 * int[] vector = new int[100];
 * 
 * for(int i=0; i<vector.length; i++){
 * vector[i]= i;
 * }
 * 
 * for(int i=vector.length-1; i>=0; i--){
 * System.out.println(vector[i]);
 * }
 */