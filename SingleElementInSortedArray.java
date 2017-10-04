class SingleElementInSortedArray {
    boolean isOdd(int n) {
        final int ONE=1; 
        return ((n&ONE) == ONE);
    }
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1; 
        while(low <= high) {
            // Just one element
            if(low == high) return nums[low];
            int mid = low + (high-low)/2; 
            if(isOdd(mid-low+1)) { // Number of elements 5,9,13...
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
                else if(nums[mid] == nums[mid+1]) low = mid; 
                else high = mid;
            } else { // Number of elements 3,7,11... 
                if(nums[mid] == nums[mid-1]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1; 
    }
}
