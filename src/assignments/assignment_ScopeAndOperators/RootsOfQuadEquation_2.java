package assignments.assignment_ScopeAndOperators;

import java.util.Scanner;

public class RootsOfQuadEquation_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A :");
        double a = sc.nextDouble();
        System.out.println("enter B :");
        double b = sc.nextDouble();
        System.out.println("enter C :");
        double c = sc.nextDouble();

        sc.close();

        double discriminent = (b*b) - (4 * a * c);

        if(discriminent > 0){
            double r1 = (-b + Math.sqrt(discriminent)) / (2 * a * c);
            double r2 = (-b - Math.sqrt(discriminent)) / (2 * a * c);
            System.out.println("Roots are real and distinct : " + r1 + " and " + r2);
        }
        else if(discriminent == 0){
            double r = -b / (2*a*c);
            System.out.println("Roots are real and equal : " + r + " and " + r);
        }
        else{
            System.out.println("Roots are imaginary");
        }

    }
}
