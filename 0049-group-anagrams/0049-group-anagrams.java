class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
        char[] arr =  s.toCharArray();
        Arrays.sort(arr);
         String key = new String(arr);
         List<String>li=new ArrayList<>();
        if(!map.containsKey(key)){
            li.add(s);
            map.put(key,li);
        }
        else{
            map.get(key).add(s);
        }
        }
        return new ArrayList<>(map.values());
    
    }
}