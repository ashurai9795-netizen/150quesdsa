class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int max=0;
     HashSet<Character>st=new HashSet<>();
     for(int i=0;i<s.length();i++){
     while(st.contains(s.charAt(i))){
        st.remove(s.charAt(j));
        j++;
     }
     st.add(s.charAt(i));
     max=Math.max(st.size(),max); 
     }
     return max;  
    }
}