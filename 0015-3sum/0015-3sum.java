class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(k>j){
                List<Integer>li=new ArrayList<>();
              if(nums[i]+nums[j]+nums[k]==0){
               Collections.addAll(li,nums[i],nums[j],nums[k]);
                ans.add(li);
                j++;
                k--;
              }
              else if(nums[i]+nums[j]+nums[k]>0)k--;
              else{
                j++;
              }
            }
        }
    return new ArrayList<>(ans);
    }
}