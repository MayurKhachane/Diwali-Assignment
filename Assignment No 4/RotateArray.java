import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }

    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            temp[newIndex] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
