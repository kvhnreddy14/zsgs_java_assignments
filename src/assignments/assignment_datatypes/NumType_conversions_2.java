package assignments.assignment_datatypes;

public class NumType_conversions_2 {
    public static void main(String[] args) {
        float floatNum = 5.75f;
        int intNum = (int) floatNum;
        System.out.println("Float to Int: " + floatNum + " -> " + intNum);

        double doubleNum = 9.87654321;
        float floatNum2 = (float) doubleNum;
        System.out.println("Double to Float: " + doubleNum + " -> " + floatNum2);

        int largeInt = 32767;
        short shortNum = (short) largeInt;
        System.out.println("Int to Short: " + largeInt + " -> " + shortNum);

        int overflowInt = 40000;
        short overflowShort = (short) overflowInt;
        System.out.println("Int to Short (Overflow Case): " + overflowInt + " -> " + overflowShort);

    }
}
