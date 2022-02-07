class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    Set<Integer>s=new HashSet<>();
              Arrays.sort(nums1);
              Arrays.sort(nums2);
        int n=nums1.length-1;
        int m=nums2.length-1;
        int i=n;
        int j=m;
        while(i>=0 && j>=0)
        {
            System.out.println(nums1[i]+" "+nums2[j]);
            if(nums1[i]==nums2[j])
            {
                s.add(nums1[i]);
                i--;
                j--;
            }
            else if(nums1[i]>nums2[j])
            {
                i--;
            }
            else if(nums1[i]<nums2[j])
            {
                j--;
            }
        }
        int sz=s.size();
        int b[]=new int [sz];
        int l=0;
        for(Integer q:s)
        {
            b[l++]=q.intValue();
        }
        return b;
    }
}