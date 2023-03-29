public class C9A5 {
    public static void main(String[] args) {

        int[][] matriz1 = { { 0, 2, 3 }, { -2, 0, 6 }, { -3, -6, 0 } };
        int cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j] != -matriz1[j][i]) {
                    cont++;
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j] == matriz1[j][i]) {
                }
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[j][i] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("");

        if (cont == 0) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }

    }
}
