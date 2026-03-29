class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt((int[] o) -> o[1]).reversed());
        for(var e : map.entrySet()){
            int arr[] = new int[2];
            arr[0] = e.getKey();
            arr[1] = e.getValue();
            pq.add(arr);
        }
        int ans[] = new int[k];
        for(int i = 0;i<k;i++){
            int[] top = pq.poll();
            ans[i] = top[0];
        }
        return ans;
    }
}
