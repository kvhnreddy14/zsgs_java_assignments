package assignments.assignment_ScopeAndOperators;

public class IfBlockVariableScope_4 {
    public static void main(String[] args) {
        int a = 5;
        if(true){
            int b = 10;
            System.out.println("inside if block : a = "+a+ " b = "+ b);
        }
        System.out.println("outside if block : a = "+a+ " b = "+ "b");
    }

    //error:
//    java: cannot find symbol
//    symbol:   variable b
//    location: class assignments.assignment2.IfBlockVariableScope_4
}
