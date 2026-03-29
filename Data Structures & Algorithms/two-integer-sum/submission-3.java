class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<n;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && i != map.get(diff)){
                arr[0] = i;
                arr[1] = map.get(diff);
                return arr;
            }
        }
        // for(int i = 0;i<nums.length-1;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]+ nums[j] == target){
        //         arr[0] = i;
        //         arr[1] = j;
        //         return arr;
        //         }
        //     }
        // }
        return arr;
    }
}
