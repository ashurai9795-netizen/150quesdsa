class Solution {
    public int jump(int[] nums) {
      int reach=0;
      int count=0;
      int j=0;
      for(int i=0;i<nums.length-1;i++){
        reach=Math.max(reach,i+nums[i]);
        if(i==j){
            count++;
             j=reach;
        
        }
       // if(j>=nums.length-1) return count;   
          }  
      return count;
    }
}