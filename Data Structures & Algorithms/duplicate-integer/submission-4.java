class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = Arrays.stream(nums)
                           .boxed()
                           .collect(Collectors.toCollection(HashSet::new));

        return s.size() < nums.length;
    }
}