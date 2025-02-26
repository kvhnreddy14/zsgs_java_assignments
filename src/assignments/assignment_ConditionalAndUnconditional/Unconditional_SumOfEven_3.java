package assignments.assignment_ConditionalAndUnconditional;

public class Unconditional_SumOfEven_3 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                continue;
            }
            sum += num;
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
