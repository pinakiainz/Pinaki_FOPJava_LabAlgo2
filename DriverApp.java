package transactiontarget;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

    public static void main(String[] args) {
        int nod;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Number of Days Shop Was Open");
        nod = sc.nextInt();

        int trans[] = new int[nod];

        int i;
        for (i = 0; i < trans.length; i++) {
            System.out.println("Please Enter Income of Day " + (i + 1));
            trans[i] = sc.nextInt();
        }

        System.out.println("Please Enter Number of Targets");
        int target = sc.nextInt();
        int sum;
        int flag;
        
        for (int j = 1; j <= target; j++) {
            System.out.println("Please Enter the Value of Target " + j);
            int singleTarget = sc.nextInt();
            flag = 0;
            sum = 0;
            
            for (int k = 0; k < trans.length; k++) {
                sum += trans[k];
                if (sum >= singleTarget) {
                    flag = 1;
                    System.out.println("Target Achieved On Day " + (k + 1));
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.println("Target NOT Achieved");
            }
        }
        
        sc.close();
    }
}