class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // HashSet<Integer>hs = new HashSet<>();
        // for(int i=0;i<timeSeries.length;i++){
        //     int key=timeSeries[i];
        //     for(int j=0;j<duration;j++){
        //         hs.add(key+j);
        //     }
        // }
        // return hs.size();
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            total+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        total+=duration;
        return total;
    }
}