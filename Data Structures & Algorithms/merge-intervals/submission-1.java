class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            return a[0] - b[0];
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 1;i<intervals.length;i++){
            if(end >= intervals[i][0]){
                end = Math.max(intervals[i][1], end);
            }else{
                list.add(new int[] {start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }list.add(new int[] {start,end});
        int ans[][] = new int[list.size()][2];
        int i = 0;
        for(int a[] : list){
            ans[i][0] = a[0];
            ans[i][1] = a[1];
            i++;
        }
        return ans;
    }
}
