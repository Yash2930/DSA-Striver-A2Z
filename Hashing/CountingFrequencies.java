package Hashing;

import java.util.ArrayList;
import java.util.List;

public class CountingFrequencies {

    public List<List<Integer>> countFrequencies(int[] nums) {

        // Step 1: Find maximum element
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Step 2: Create hash array
        int[] hash = new int[max + 1];

        // Step 3: Count frequencies
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        // Step 4: Store answer
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                List<Integer> pair = new ArrayList<>();
                pair.add(i);         // number
                pair.add(hash[i]);   // frequency

                result.add(pair);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 2, 1, 3};

        CountingFrequencies obj = new CountingFrequencies();

        List<List<Integer>> ans = obj.countFrequencies(nums);

        System.out.println(ans);
    }
}