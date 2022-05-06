package main.java.com.fd.leetcode.yanL;

public class ContainsDuplicate {

    public boolean solution(int[] nums) {
        quickSoft(nums, 0, nums.length - 1);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    private void quickSoft(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = nums[left], l = left, r = right;
            while (l < r) {
                while (l < r && nums[r] > pivot) r--;
                if (l < r) nums[l++] = nums[r];

                while (l < r && nums[l] < pivot) l++;
                if (l < r) nums[r--] = nums[l];
            }
            nums[l] = pivot;
            quickSoft(nums, left, l - 1);
            quickSoft(nums, l + 1, right);
        }
    }
}

