/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/elimination-game/
 */ 

public class EliminationGame {
    public int wrapper(int start, int end, int count, int gap, boolean order){
        if(count == 1){
            return start; 
        } else if(count == 2) { // Reduce to two elements 
            if(order){ // left to right
                return end; 
            } else { // right to left
                return start; 
            }
        } else {
            if(count%2 == 0) {
                if(order) return wrapper(start+gap, end, count/2, gap*2, !order);
                else return wrapper(start, end-gap, count/2, gap*2, !order);
            } else {
                return wrapper(start+gap, end-gap, count/2, gap*2, !order);
            }
        }
    }
    
    public int lastRemaining(int n) {
        if(n<=0) return n;  
        return wrapper(1, n, n, 1, true); 
    }
}