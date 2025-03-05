package assignments.assigment_Arrays;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class JaggedArray_5 {
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue[] pList = new Queue[n];
        for(int i = 0; i< n; i++){
            pList[i] = new PriorityQueue<>();
        }
        System.out.println(pList[0].getClass().getName());
        System.out.println("Please enter the id of person(0 to n) : ");
        int select = sc.nextInt();
        System.out.println("Please enter the id of person with id - "+ select);
        int addweight = sc.nextInt();
        pList[select].add(addweight);
        System.out.println("Enter an id , i give you the minimum weight of that person :");
        int minid = sc.nextInt();
        System.out.println("minimum weight of person - " + minid + " is "+ pList[minid].peek());
    }
}
