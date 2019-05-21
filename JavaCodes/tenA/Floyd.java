package tenA;

import java.util.Scanner;

class Floyd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Vertices");
        int n = scan.nextInt();
        int[][] D = new int[10][10];

        System.out.println("Enter Distance Matrix");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                D[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }

        System.out.println("Shortest Distance Matrix");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
