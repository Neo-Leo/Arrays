/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/max-consecutive-ones/
 */ 

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0; 
        int start=0,end=0,count=0,n=nums.length, maxLen=0;
        while(end<=n-1){
            while(start<=n-1 && nums[start]==0) start++; 
            if(start == n) break;
            end=start; 
            while(end<=n-1 && nums[end]==1) end++; 
            maxLen = Math.max(maxLen,end-start);
            start = end; 
        }
        return maxLen; 
    }
}