package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverAppCurrency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = sc.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations values:");
        for (int i = 0; i < size; i++) {
            denominations[i] = sc.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();

        // Sort the denominations in descending order
        Arrays.sort(denominations);
        for (int i = 0; i < size / 2; i++) {
            int temp = denominations[i];
            denominations[i] = denominations[size - 1 - i];
            denominations[size - 1 - i] = temp;
        }

        int notesCount = 0;

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        for (int i = 0; i < size; i++) {
            int count = amount / denominations[i];
            if (count > 0) {
                notesCount += count;
                amount %= denominations[i];
                System.out.println(denominations[i] + ":" + count);
            }
        }

        System.out.println("Total number of notes used: " + notesCount);

        sc.close();
    }
}