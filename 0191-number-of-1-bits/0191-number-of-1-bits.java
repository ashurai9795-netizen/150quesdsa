class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int ans=0;
        for(int i=0;i<32;i++){
           // ans|=(n&1);
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}