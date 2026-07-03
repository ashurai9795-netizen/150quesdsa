class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    int x=nums.length;
     for(int i=0;i<x;i++){
        for(int j=i+1;j<=i+k&&j<x;j++){
        if(nums[i]==nums[j]&&Math.abs(i-j)<=k) return true;
     }
     }
     return false;
        
     }   
    }

