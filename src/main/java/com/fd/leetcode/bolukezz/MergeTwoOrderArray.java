package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/5/11 22:10
 */
public class MergeTwoOrderArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int idx = 0;
        int l0 = 0;
        int l1 = 0;
        while (l0 < m || l1 < n) {
            if (l0 >= m) {
                res[idx] = nums2[l1++];
            } else if (l1 >= n) {
                res[idx] = nums1[l0++];
            } else {
                if (nums1[l0] <= nums2[l1]) {
                    res[idx] = nums1[l0++];
                } else {
                    res[idx] = nums2[l1++];
                }
            }
            idx++;
        }
        System.arraycopy(res, 0, nums1, 0, m + n);
    }
}
