package main.java.com.fd.leetcode.hi100100;

/**
 * @author Administrator
 * @data 2022/3/29  15:06
 */
public class exchange {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] % 2) == 1) {
                i++;
            }
            while(i < j && (nums[j] % 2) == 0){
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
