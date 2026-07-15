class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> iMap = new HashMap(); // Map<num[x], x> where we return {x, j}; x = j
        int diff;
        for (int j = 0; j < nums.length; j++) {
            diff = target - nums[j];
            if (iMap.containsKey(diff))
                return new int[] {iMap.get(diff), j};

            iMap.putIfAbsent(nums[j], j);
        }
        return new int[] {};
    }
}
