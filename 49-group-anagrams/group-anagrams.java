class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map <String,List<String>> hashmap = new HashMap<>();
        for(String word:strs)
        {
        char[] chararray=word.toCharArray();
        Arrays.sort(chararray);
        String key=new String(chararray);
        if(!hashmap.containsKey(key))
        {
             hashmap.put(key,new ArrayList<>());
        }
        hashmap.get(key).add(word);
        }
        return new ArrayList<>(hashmap.values());   
    }
}