package assignments.assigment_Strings;

public class ReversWords_3 {
    public static void main(String[] args) {
        String string = "   the following fils has won 9 awards.    ";
        string = string.trim();
        String ans = "";
        for (String str : string.split(" ")) {
            ans = str + ans;
            ans = " " + ans;
        }
        System.out.println(ans);
    }
}
