package assignments.assignment_datatypes;

import java.util.Scanner;

enum Weekday{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class WeekdayFromInput_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Weekday weekday = Weekday.values()[num-1];

        System.out.println(weekday);
    }


}
