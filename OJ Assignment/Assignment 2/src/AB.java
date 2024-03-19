import java.util.Arrays;

public class AB {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));

        triple(arr[0]);
        System.out.println("After: " + Arrays.toString(arr));
    }
    public static void triple(int x) {
        x *= 3;
    }

}
