class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>m1=new LinkedHashMap<>();
        Map<Character,Integer>m2=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(m1.containsKey(c))
            {
                m1.put(c,m1.get(c)+1);
            }
            else
            {
                m1.put(c,1);
            }
        }
        // System.out.print(m1);
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            
            if(m2.containsKey(c))
            {
                m2.put(c,m2.get(c)+1);
            }
            else
            {
                m2.put(c,1);
            }
        }
        
        return m1.equals(m2);
    }
}