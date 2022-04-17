package main.java.com.fd.leetcode.yanL;

public class TwoSum {

    public static int[] solution(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int n=0;
        while (l<=r){
            n = nums[l] + nums[r];
            if (n == target) break;
            if (n > target){
                r--;
            }else {
                l++;
            }
        }
        return new int[]{nums[l],nums[r]};
    }
}
