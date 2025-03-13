import java.util.HashMap;
import java.util.Map;

public class Zad2 {
    public static int findDominant(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int threshold = array.length / 2;
        for (int num :array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array1 = {3, 3, 3, 2, 2 };
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 5, 1};

        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }
}
