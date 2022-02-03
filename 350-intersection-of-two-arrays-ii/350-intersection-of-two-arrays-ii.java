class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=Math.min(nums1.length,nums2.length);
        // System.out.println(n);
        ArrayList<Integer> a=new ArrayList<>();
        
        int i=nums1.length-1;
        int j=nums2.length-1;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         System.out.println(i+" "+j);
        while(i>=0 && j>=0)
        {
             System.out.println(nums1[i]+" "+nums2[j]);
            if(nums1[i]==nums2[j])
            {
                a.add(nums1[i]);
                 System.out.println(a);
                i--;
                j--;
                
            }
            else if(i>=0 && j>=0 && nums1[i]>nums2[j])
            {
                i--;
            }
           else if(i>=0 && j>=0 && nums1[i]<nums2[j])
            {
                j--;
            }
        }
        int b[]=new int[a.size()];
        for(int l=0;l<b.length;l++)
        {
            b[l]=a.get(l);
        }
        return b;
    }
}