package MasterCodingChallengePackage;

import java.util.HashMap;
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 0;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to the target:" + result[0] + "," + result[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two elements add up to the target");
    }

}