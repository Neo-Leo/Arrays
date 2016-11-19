/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/4sum-ii/
 */ 

public class 4Sum2 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
        int n = A.length; 
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                int count = 0, sum = A[i] + B[j] ; 
                if(hm.containsKey(sum)){
                    count = hm.get(sum);
                    hm.put(sum,count+1); 
                } else {
                    hm.put(sum,1); 
                }
            }
        }
        int result=0; 
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                int count = 0, sum = -(C[i] + D[j]) ; 
                if(hm.containsKey(sum)){
                    result += hm.get(sum);
                }
            }
        }
        return result; 
    }
}