package com.fd.leetcode.hujih;

/**
 * @description:
 * @author: hjh
 * @date:2022-03-29 15:06
 **/
public class DisOldAndEven {

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        //一次遍历调整所有奇偶顺序
        while (i < j) {
            //
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            while (i < j && nums[i] % 2 == 0) {
                int temp = nums[j] ;
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
        }
        return nums;
    }
}
