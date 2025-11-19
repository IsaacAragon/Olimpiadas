import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 3, 12, 8};
        int total  = sumArray(array);
        System.out.println(total);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}