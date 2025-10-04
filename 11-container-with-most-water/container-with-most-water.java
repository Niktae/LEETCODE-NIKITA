class Solution {
    public int maxArea(int[] height) {
        int h;
        int w;
        int j=height.length-1;
        int i=0;
        int max=0;
        while(i<j){
            h=Math.min(height[i],height[j]);
            w=(j-i);
            int area=h*w;
            max=Math.max(max,area);
            if(height[i]<height[j]){
                 i++;
            }
            else{
                j--;
            } 
        }
        return max;
    }
}