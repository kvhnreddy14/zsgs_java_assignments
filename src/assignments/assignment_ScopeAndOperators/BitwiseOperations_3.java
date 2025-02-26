package assignments.assignment_ScopeAndOperators;

import java.util.Scanner;

public class BitwiseOperations_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number :");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number :");
        int num2 = sc.nextInt();
        System.out.println("Bitwise AND (&): " + (num1 & num2));
        System.out.println("Bitwise OR (|): " + (num1 | num2));
        System.out.println("Bitwise XOR (^): " + (num1 ^ num2));
        System.out.println("Left Shift (num1 << 2): " + (num1 << 2));
        System.out.println("Right Shift (num1 >> 2): " + (num1 >> 2));
        System.out.println("Unsigned Right Shift (num1 >>> 2): " + (num1 >>> 2));
    }
}
