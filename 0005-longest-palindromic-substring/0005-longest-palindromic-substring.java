class Solution {
      int max=0,strt=0,end=0;
    public  boolean isPalandrome(String s,int i,int j){
 while(i<=j){
 if(s.charAt(i)!=s.charAt(j)) return false;
 i++;
 j--;
 }
 return true;
    }
    public String longestPalindrome(String s) {
      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(isPalandrome(s,i,j)==true){
                if(j-i+1>max){
                    max=j-i+1;
                    strt=i;
                    end=j;
                }
            }
        }
      } 
       return s.substring(strt,end+1);
    }
}