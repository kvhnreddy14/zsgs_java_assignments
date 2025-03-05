package assignments.assigment_Strings;

import java.util.Scanner;

public class EmailCheck_4 {
    public static boolean validch(String s){
        int at = s.indexOf("@");
        int dot = s.indexOf(".");

        if(dot - at < 2 || at == 0 || dot == 0 || dot == -1 || at == -1 || dot == s.length()){
            return false;
        }

        int ats = 0;
        int dots = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '@'){
                ats++;
            } else if (s.charAt(i) == '.') {
                dots++;
            }
            else if (!Character.isLetter(s.charAt(i)) && s.charAt(i) != '@' && s.charAt(i) != '.') {
                return false;
            }
            if(ats > 1 || dots > 1){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(validch(s));
    }
}
