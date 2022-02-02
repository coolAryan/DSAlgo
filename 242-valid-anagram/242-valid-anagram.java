class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int count[]=new int[26];
        for(char s1:s.toCharArray())
        {
            count[s1-'a']++;
        }
         for(char t1:t.toCharArray())
        {
            count[t1-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}