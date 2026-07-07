class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int Tsum=0;
        int CMax=0;
        int CMin=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       for(int num:nums){
        Tsum+=num;

        CMax=Math.max(num,CMax+num);
        max=Math.max(max,CMax);

        CMin=Math.min(num,CMin+num);
        min=Math.min(min,CMin);
       } 
    if(max<0){
        return max;
    }
    return Math.max(max,Tsum-min);
    }
}