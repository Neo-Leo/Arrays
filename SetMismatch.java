class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, xor=0, repeated_num=-1; 
        boolean[] hasFound = new boolean[n];
        for(int i=0; i<n; i++) {
            if(hasFound[nums[i]-1]) {
                repeated_num = nums[i];
            }
            xor^=(i+1);
            xor^=nums[i];
            hasFound[nums[i]-1]=true;
        }
        int[] res = new int[2];
        res[0] = repeated_num; 
        res[1] = xor^repeated_num;
        return res; 
    }
}
