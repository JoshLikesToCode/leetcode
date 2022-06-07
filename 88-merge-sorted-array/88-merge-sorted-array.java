class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int res_index = 0;
        int a = 0;
        int b = 0;
        
        while(a < m && b < n)
        {
            if(nums1[a] <= nums2[b])
                res[res_index++] = nums1[a++];
            else
                res[res_index++] = nums2[b++];
        }
        while(a < m)
            res[res_index++] = nums1[a++];
        while(b < n)
            res[res_index++] = nums2[b++];
        
        for(int i = 0; i < (m+n); i++)
            nums1[i] = res[i];
    }
}