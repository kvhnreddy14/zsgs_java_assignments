package assignments.assignment_ConditionalAndUnconditional;

public class Unconditional_Primes1to30_2 {
    static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 2; i <= 30; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
