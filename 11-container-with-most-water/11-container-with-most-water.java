class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int a = 0;
        int b = height.length-1;
        while(a<b){
            if(height[a]<height[b]){
                maxArea = Math.max(maxArea,height[a]*(b-a));
                a++;
            }else{
                maxArea = Math.max(maxArea,height[b]*(b-a));  
                b--;
            }
        }
        return maxArea;
    }
}