public class Q1 
{ public static void main(String[] args) 
    {
         int num = 17; 
         System.out.println(isPrime(num)); 

        } 
        public static boolean isPrime(int num)

        { 
            for(int i = 2; i < num/2; i++)
            { if(num % i == 0)
                
                { return false; 
            } 
        } return true; 
    }
 }