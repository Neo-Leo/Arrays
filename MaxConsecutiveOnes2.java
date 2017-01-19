/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/max-consecutive-ones-ii/
 */ 

public class MaxConsecutiveOnes2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0; 
        if(nums.length == 1) return 1; 
        int start=0, end=0, maxLen=1, zeroCount=0, n=nums.length; 
        while(end <= n-1) {
            if(nums[end++] == 0) zeroCount++; 
            while(zeroCount > 1) {
                if(nums[start++] == 0) zeroCount--;  
            }
            maxLen = Math.max(maxLen,end-start); 
        }
        return maxLen; 
    }
}