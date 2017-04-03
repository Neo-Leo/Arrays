/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/teemo-attacking/
 */ 

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length == 0) return 0; 
        int nextTime = 0, totalTime = 0, n = timeSeries.length; 
        totalTime = duration; 
        nextTime = timeSeries[0] + duration; 
        for(int i=1; i<=n-1; i++) {
            totalTime += (timeSeries[i] + duration) - Math.max(nextTime,timeSeries[i]); 
            nextTime = timeSeries[i] + duration;
        }
        return totalTime;
    }
}