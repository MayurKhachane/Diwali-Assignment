// import java.util.Scanner;

// public class MissingNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the size of array (n): ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " numbers (0 to n, one missing):");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int total = n * (n + 1) / 2;
        
//         int sum = 0;
//         for(int num : arr) {
//             sum += num;
//         }
        
//         int missing = total - sum;
//         System.out.println("The missing number is: " + missing);
//     }
// }

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter Arrays");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = n * (n + 1)/ 2;
        int sum = 0;
        for(int num : arr){
            sum += num; 
        }

        int result = target - sum;
        System.out.println(result);
    }
}