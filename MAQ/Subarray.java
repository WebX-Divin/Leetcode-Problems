package MAQ;

import java.util.*;
//sunarray sum equals to k

public class Subarray {

    static public int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 2, 1, 4 };
        int k = 7;
        int result = subarraySum(arr, k);
        System.out.println("The result is: " + result);
    }
}
