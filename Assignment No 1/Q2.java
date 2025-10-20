public class Q2 {
    public static void main(String[] args) {
        System.out.println("Prime Number are");
        for(int i = 0; i <= 100; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    
    }
    public static boolean isPrime(int num)
    {
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num/2; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
