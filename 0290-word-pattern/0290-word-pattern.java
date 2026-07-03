class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");

        if(pattern.length() != words.length)
            return false;
        Map<Character,String>map=new HashMap<>();
        Map<String,Character>map1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c1=pattern.charAt(i);
            String word=words[i];
            if(map.containsKey(c1)){
                if(!map.get(c1).equals(word)) return false;
            }else{
                  map.put(c1,word);
            }
              if(map1.containsKey(word)){
                if(!map1.get(word).equals(c1)) return false;
            }else{
                  map1.put(word,c1);
            }
    }
    return true;
}
}