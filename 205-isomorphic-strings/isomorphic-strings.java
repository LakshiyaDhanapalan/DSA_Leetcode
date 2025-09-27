class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
       if(s.length() != t.length())
       {
        return false;
       }
       int [] maps = new int [256];
       int [] mapt = new int[256];
       for(int i=0;i<s.length();i++)
       {
        char s1=s.charAt(i);
        char t1= t.charAt(i);
        if(maps[s1]==0 && mapt[t1]==0)
        {
            maps[s1]=t1;
            mapt[t1]=s1;
        }
        else if(maps[s1] !=t1 || mapt[t1]!=s1)
        {
            return false;
        }
       }
       return true;
        
    }
}