class Solution {
    public String longestPalindrome(String s) 
    {
        if (s == null || s.length() < 1) 
             return "";
        int start =0, end=0;
        for(int i=0;i<s.length();i++)
        {
            int left=i, right=i;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right) )
            {
                if((right-left) > (end-start))
                {
                start=left;
                end=right;
                }
                left--;
                right++;
            }
            left=i-1;
            right=i;
            while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right))
            {
                if((right-left) > (end-start))
                {
                start=left;
                end=right;
                }
                left--;
                right++;
            }
          }
          return s.substring(start,end+1);
    }
}