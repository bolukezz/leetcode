package main.java.com.fd.leetcode.hi100100;

/**
 * @author zhoudj
 * @data 2022/4/12  14:32
 */
public class search {
    public int search(int[] nums, int target) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            if (nums[0]==target){
                return 1;
            }
            return 0;
        }
        int a = nums.length/2-1;
        int b = nums[a];
        int count = 0;

        if (target >= b){
            for (int i = 1; i <= a; i++) {
                if (nums[a-i] == target){
                    count++;
                }else {
                    break;
                }
            }
            for (int i = a; i < nums.length; i++) {
                if (nums[i]==target){
                    count++;
                }else if(nums[i]==target){
                    break;
                }
            }
        }else {
            for (int i = 1; i <= a; i++) {
                if (nums[a-i] == target){
                    count++;
                }
                if (nums[a-i] < target){
                    break;
                }
            }
        }
        return count;
    }
}
