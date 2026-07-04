class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        set.add(num);
        }
        int longe=0;
        for(int nume:set){
            if(!set.contains(nume-1)){
                int curr=nume;
               int length=1;
                while(set.contains(curr+1)){
                    curr++;
                   length++;
                }
                longe=Math.max(longe,length);
            }
            //longe=Math.max(longe,length);
        }  
        return longe;

    }
}