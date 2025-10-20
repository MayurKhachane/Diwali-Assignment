import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c; 
        
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.print("Fibonacci series: " + a + "" + b + "");
        for(int i = 2; i < num; i++){
            c = a + b;
            System.out.print(c + "");
            a = b;
            b = c;
        }
    }
}
