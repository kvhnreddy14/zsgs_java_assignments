package assignments.assigment_Strings;
public class SqueakyClean_6 {
    public static String clean(String input) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                result.append('_');
            } else if (c == '-') {
                toUpperCase = true;
            } else if (Character.isLetter(c)) {
                result.append(toUpperCase ? Character.toUpperCase(c) : c);
                toUpperCase = false;
            } else if (Character.isDigit(c)) {
                switch (c) {
                    case '4': result.append('a'); break;
                    case '3': result.append('e'); break;
                    case '0': result.append('o'); break;
                    case '1': result.append('l'); break;
                    case '7': result.append('t'); break;
                    default: break;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean_6.clean("my   Id"));
        System.out.println(SqueakyClean_6.clean("a-bc"));
        System.out.println(SqueakyClean_6.clean("H3ll0 W0rld"));
    }
}
