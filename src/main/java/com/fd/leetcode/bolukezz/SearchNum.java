package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/4/12 9:45 上午
 */
public class SearchNum {
    public int search(int[] nums, int target) {
        int res = 0;
        for (int num : nums) {
            res = num == target ? ++res : res;
        }
        return res;
    }

    //todo 写不出来 有时间再看
    public int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length-1, res = 0;
        while (left <= right) {
            int mid = ((right - left) >>> 1) + left;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        while (right > 0 && nums[right--] == target) {
            res++;
        }
        return res;
    }
}
