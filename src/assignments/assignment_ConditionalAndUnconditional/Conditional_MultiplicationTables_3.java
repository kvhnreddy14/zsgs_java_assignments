package assignments.assignment_ConditionalAndUnconditional;

import java.util.Scanner;

public class Conditional_MultiplicationTables_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("\nMultiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num +" x " +i+" = " +(num * i));
        }
    }
}
