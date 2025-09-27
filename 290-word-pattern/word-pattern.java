class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> charmap=new HashMap<>();
        HashMap<String,Character> wordmap=new HashMap<>();
           String[] str=s.split(" ");
        if(pattern.length() != str.length)
        {
            return false;
        }
     
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String word=str[i];
            if(charmap.containsKey(c))
            {
                if(!charmap.get(c).equals(word))
                {
                    return false;

                }
            }
            else
            {
                charmap.put(c,word);

            }
                
            
             if(wordmap.containsKey(word))
            {
                if(!wordmap.get(word).equals(c))
                {
                    return false;

                }
                
            }
            else
            {
                wordmap.put(word,c);

            }
        }
        
       
    return true;
    }
}