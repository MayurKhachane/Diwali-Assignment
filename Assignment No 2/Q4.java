import java.util.Scanner;

public class Q4 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        isRevered(num);
    
    }
    
    public static void isRevered(int num){
        int originalNum = num;
        int reverse = 0;
                while(num != 0){
                   int digit = num % 10;
                   reverse = reverse * 10 + digit;
                   num = num / 10;
                }
                System.out.println("Reversed Number is " + " " + reverse + " " + "And Original " +  originalNum);
        
    }
}
