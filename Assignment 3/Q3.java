import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
     
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================Pyramid=====================");
         System.out.print("Enter number of rows: ");
        int rows1 = sc.nextInt();

        for(int i = 1; i <= rows1; i++){
            
            for(int j = i; j < rows1; j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
    }
    
    }
}