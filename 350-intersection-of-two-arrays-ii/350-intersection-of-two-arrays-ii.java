class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(m.containsKey(nums1[i]))
            {
                m.put(nums1[i],m.get(nums1[i])+1);
            }
            else
            {
                m.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(m.containsKey(nums2[i])&& m.get(nums2[i])>0)
            {
                a.add(nums2[i]);
             m.put(nums2[i],m.get(nums2[i])-1);
            }
        }
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            b[i]=a.get(i);
        }
        return b;
    }
}