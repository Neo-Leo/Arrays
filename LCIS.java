class LCIS {
    public int findLengthOfLCIS(int[] nums) {
        int start=0,n=nums.length,end=1,maxLength=1; 
        if(n <= 1) return n;
        while(end <= n-1){
            while(end<=n-1 && nums[end-1]<nums[end]) end++;
            maxLength = Math.max(maxLength,end-start);
            start = end; 
            end++;
        }
        return maxLength;
    }
}
