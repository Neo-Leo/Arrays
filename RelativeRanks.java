/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/relative-ranks/
 */ 

public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length; 
        String[] ranks = new String[n];
        int[] incArray = new int[n];
        for(int i=0; i<=n-1; i++) {
            incArray[i] = nums[i]; 
        }
        Arrays.sort(incArray);
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for(int i=0; i<n; i++){
            hm.put(incArray[i],i);
        }
        for(int i=0; i<n; i++){
            if(hm.get(nums[i]) == n-1){
                ranks[i] = "Gold Medal";
            } else if(hm.get(nums[i]) == n-2) {
                ranks[i] = "Silver Medal";
            } else if(hm.get(nums[i]) == n-3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = Integer.toString(n-hm.get(nums[i]));  
            }
        }
        return ranks;
    }
}