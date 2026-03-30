import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 5, 1 };

        Arrays.sort(arr);

        System.out.print("Duplicates: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
