package main.java.com.fd.leetcode.yanL;

public class Search {

    public static int solution(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                if (nums[low] == nums[high]) {
                    return high - low + 1;
                }
                if (nums[low] < target) {
                    low++;
                }
                if (nums[high] > target) {
                    high--;
                }
            }

        }
        return 0;
    }

}
