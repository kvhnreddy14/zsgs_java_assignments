package assignments.assigment_Strings;

public class ReverseString_2 {
    public static void main(String[] args) {
        String string = "Chatrapathi Shivaji";
        String ans = new String(reverse(string.toCharArray()));
        System.out.println(ans);
    }
    private static char[] reverse(char[] charArray) {
        int s=0;
        int e=charArray.length-1;
        while (s<e) {
            char ch =charArray[s];
            charArray[s]=charArray[e];
            charArray[e]=ch;
            s++;
            e--;
        }
        return charArray;
    }
}
