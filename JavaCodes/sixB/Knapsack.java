package sixB;

import java.util.Scanner;

class Knapsack {

    double[] weight, profit, ratio, solnVector;
    double capacity;

    Knapsack() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Items");
        int n = scan.nextInt();
        weight = new double[n];
        profit = new double[n];
        ratio = new double[n];
        solnVector = new double[n];

        System.out.println("Enter Weights of Items");
        for (int i = 0; i < n; i++) {
            weight[i] = scan.nextDouble();
        }

        System.out.println("Enter Profits of Items");
        for (int i = 0; i < n; i++) {
            profit[i] = scan.nextDouble();
        }

        System.out.println("Enter Capacity of Knapsack");
        capacity = scan.nextDouble();
        scan.close();
    }

    int getNext() {
        int index = -1;
        double highest = 0;

        for (int i = 0; i < ratio.length; i++) {
            if (ratio[i] > highest) {
                highest = ratio[i];
                index = i;
            }
        }
        return index;
    }

    void fill() {
        double currentWeight = 0;
        double currentProfit = 0;
        
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = profit[i] / weight[i];
        }

        System.out.print("Items Considered: ");
        while (currentWeight < capacity) {
            int item = getNext();

            if (item == -1) {
                break;
            }

            System.out.print((item + 1) + " ");

            if (currentWeight + weight[item] <= capacity) {
                currentWeight += weight[item];
                currentProfit += profit[item];
                solnVector[item] = 1;
                ratio[item] = 0;
            } else {
                currentProfit += ratio[item] * (capacity - currentWeight);
                solnVector[item] = (capacity - currentWeight) / weight[item];
                break;
            }
        }

        System.out.println();
        System.out.println("Maximum Profit is: " + currentProfit);
        System.out.print("Solution Vector: ");
        for (int i = 0; i < solnVector.length; i++) {
            System.out.print(solnVector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.fill();
    }
}
