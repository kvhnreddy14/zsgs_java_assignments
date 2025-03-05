package assignments.assigment_Strings;

public class CapitalizeWords_5 {
    public static void main(String[] args) {
        String s = "a string has letters";
        s.trim();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 && Character.isLetter(c)){
                sb.append(Character.toUpperCase(c));
                continue;
            }

            if(c == ' '){
                flag = true;
                sb.append(c);
                continue;
            }
            if(Character.isLetter(c) && flag){
                sb.append(Character.toUpperCase(c));
                flag = false;
                continue;
            }
            sb.append(c);
            flag = false;
        }
        System.out.println(sb.toString());
    }



}
