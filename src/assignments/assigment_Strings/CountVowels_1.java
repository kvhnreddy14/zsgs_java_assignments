package assignments.assigment_Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels_1 {
    public static void main(String[] args) {

        String string = "chatrapathi shivaji";

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));


        int count=0;
        for (char ch : string.toCharArray()) {{}
            if(Character.isLetter(ch)&& vowels.contains(Character.toLowerCase(ch))){
                count++;
            }
        }
        System.out.println(count);
    }
}
