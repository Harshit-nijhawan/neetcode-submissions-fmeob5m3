class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        for(int i = 0;i<nums.length;i++){
            int el = nums[i];
            int count = 1;
            while(set.contains(el + 1)){
                count++;
                el++;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
