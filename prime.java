import java.io.*;
import java.util.Arrays;

public class prime {
    public static int[] remove(int[] arr, int in) {
        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in)
                continue;
            
              arr2[k++] = arr[i];
        }
        return arr2;
    };
    public static void main(String[] args) {
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 2;
        };
        for (int j = 0; j < list.length; j++) {
            for (int k = j + 1; k < list.length; k++) {
                if (((list[k] % list[j]) == 0)) {
                    list = remove(list,k);
                };
            };
        };
        System.out.println(Arrays.toString(list));
    };
}
