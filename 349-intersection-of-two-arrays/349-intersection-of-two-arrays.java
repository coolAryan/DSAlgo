class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>s=new HashSet<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
           if(s.contains(nums2[i]))
           {
               a.add(nums2[i]);
               s.remove(nums2[i]);
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