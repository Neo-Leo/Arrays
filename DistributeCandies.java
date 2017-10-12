class DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : candies){
            hs.add(i);
        }
        return Math.min(candies.length/2,hs.size());
    }
}
