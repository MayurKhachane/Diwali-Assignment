import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("This is Even Number " + num);
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
