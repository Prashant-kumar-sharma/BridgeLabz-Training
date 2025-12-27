import java.util.Arrays;    
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i<nums1.length)
                a[i]=nums1[i];
            else
                a[i]=nums2[i-nums1.length];
        }
        Arrays.sort(a);
        if(n%2==1)
        {
            float i=0;
            return (float)(a[n/2 ]);
        }
        else
            return (float)(a[n/2 -1]+a[(n/2) ])/2;
    }
}