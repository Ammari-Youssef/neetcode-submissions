class Solution {
    public boolean hasDuplicate(int[] nums) {
        int val;
        int n = nums.length;
        for(int i = 0 ; i< n; i++){
            val = nums[i];
            for(int j = n - 1 ; j != i && j >= 0; j--){
                if (nums[j] == val) {return true; }
            }
        }

        return false;
    }
}