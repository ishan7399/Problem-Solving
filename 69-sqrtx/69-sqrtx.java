class Solution {
    public int mySqrt(int x) {
        double y = Math.sqrt(x);
        int ans =(int) Math.round(y-0.5);
        //if(ans> Integer.MAX_VALUE/10 )return 0;
        return ans;
    }
}