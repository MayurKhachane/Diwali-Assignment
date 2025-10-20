import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.next();
        String result = isPalindrome(name);
        if (result.equals(name)) {
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        
    }
    public static String isPalindrome(String name){
        return new StringBuffer(name).reverse().toString();
    }
}
