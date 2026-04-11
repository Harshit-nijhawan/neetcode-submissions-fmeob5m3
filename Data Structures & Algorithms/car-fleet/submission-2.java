class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double ans[][] = new double[n][2];
        for(int i = 0;i<n;i++){
            ans[i][0] = position[i];
            ans[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(ans, (a, b) -> Double.compare(b[0], a[0]));
        double maxTime = 0;;
        int fleet = 0;
        for(int i = 0;i<n;i++){
            double time = ans[i][1];
            if(time > maxTime){
                fleet++;
                maxTime = time;
            }
        }
        return fleet;
    }
}
