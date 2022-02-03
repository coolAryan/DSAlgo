class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer>list=new ArrayList<>();
        int hash[]=new int[256];
        int count=p.length();
        int st=0;
        int e=0;
        for(char c:p.toCharArray())
        {
            hash[c]++;
        }
        while(e<s.length())
        {
            if(hash[s.charAt(e)]>=1)
            {
                count--;
            }
            hash[s.charAt(e)]--;
            e++;
            if(count==0)
            {
                list.add(st);
            }
            if(e-st==p.length())
            {
                if(hash[s.charAt(st)]>=0)
                {
                    count++;
                }
                hash[s.charAt(st)]++;
                st++;
                
            }
        }
        return list;
        
        
    }
}