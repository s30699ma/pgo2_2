import java.util.Arrays;

public class Zad3 {
    public static int[] rotateArray(int[] array, int positions){
        int n = array.length;
        if (n == 0 || positions % n == 0) return array;
        positions = positions % n;
        int[] rotated = new int[n];
        System.arraycopy(array, n - positions, rotated, 0, positions);
        System.arraycopy(array, 0, rotated, positions, n - positions);
        return rotated;
    }
    public static void main(String[] array) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.toString(rotateArray(array1, 2)));
        System.out.println(Arrays.toString(rotateArray(array2, 3)));
    }
}
