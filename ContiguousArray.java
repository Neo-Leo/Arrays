/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/contiguous-array/
 */ 

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null) return 0; 
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        int maxLen=0, currSum=0; 
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) currSum += -1; 
            else currSum += 1; 
            if(currSum == 0) {
                maxLen = Math.max(maxLen,i+1); 
            } else {
                if(!hm.containsKey(currSum)) {
                    hm.put(currSum,i); 
                } else {
                    maxLen = Math.max(maxLen,i - hm.get(currSum));
                }
            }
        }
        return maxLen; 
    }
}