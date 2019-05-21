package eleven;
import java.util.Scanner;

class Subset {
    static int[] arr;
    static int count;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = scan.nextInt();
        arr = new int[n];

        System.out.println("Enter Elements of Set");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter Total Sum value");
        int total = scan.nextInt();
        scan.close();
        
        subSet(total, n - 1, new boolean[n]);

        if (count == 0) {
            System.out.println("No solution");
        }
    }

    static void subSet(int total, int index, boolean[] solution) {
        if (total == 0) {
            printSolution(solution);
        } else if (total < 0 || index < 0) {
            return;
        } else {
            boolean[] tempSolution = solution.clone();
            tempSolution[index] = false;
            subSet(total, index - 1, tempSolution);
            tempSolution[index] = true;
            subSet(total - arr[index], index - 1, tempSolution);
        }
    }

    static void printSolution(boolean[] solution) {
        count += 1;
        System.out.print("Solution: ");
        for (int i = 0; i < solution.length; i++) {
            if (solution[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
