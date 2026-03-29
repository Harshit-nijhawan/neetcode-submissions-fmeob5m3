class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        for(var e : map.entrySet()){
            int arr[] = new int[2];
            arr[0] = e.getKey();
            arr[1] = e.getValue();
            pq.add(arr);
            if(pq.size() > k){
                pq.poll();
            } 
        }
        int ans[] = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            ans[i] = top[0];
            i++;
        }
        return ans;
    }
}
