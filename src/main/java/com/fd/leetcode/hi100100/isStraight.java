package main.java.com.fd.leetcode.hi100100;

import java.util.Arrays;

/**
 * @author zhoudj
 * @data 2022/4/21  16:22
 */
public class isStraight {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0){
                joker++;
            }
            else if(nums[i] == nums[i + 1]){
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }
}
