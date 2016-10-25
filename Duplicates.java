/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */ 

public class Solution {
    
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> resList = new ArrayList<Integer>(); 
        
        for(int elem : nums) {
            
            if(nums[Math.abs(elem)-1] < 0) {
                
                resList.add(Math.abs(elem)); 
            
            } else {
                
                nums[Math.abs(elem)-1] *= -1; 
            
            }
        
        }
        
        return resList; 
    
    }

}