package assignments.assignment_ConditionalAndUnconditional;

import java.util.Scanner;

public class Unconditional_secondOccurance_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,3,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from {1,2,3,4,1,3,9}");
        int target = sc.nextInt();

        int count = 0;
        int index = -1;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
            if(count == 2){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
