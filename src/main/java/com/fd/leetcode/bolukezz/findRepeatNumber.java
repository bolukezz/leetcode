package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/19 12:22 下午
 */
public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int index = 0;
        int len = nums.length;
        while (index < len) {
            //说明当前位置正确，下一个
            if (nums[index] == index) {
                index++;
                continue;
            }
            //重复返回
            if (nums[nums[index]] == nums[index]) {
                return nums[index];
            }
            //比较并交换，这里i不++，因为交换过来的数还要继续判断位置是否正确
            int temp = nums[index];
            nums[index] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
