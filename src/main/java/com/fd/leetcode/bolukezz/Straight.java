package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/4/22 4:42 下午
 */
public class Straight {
    public boolean isStraight(int[] nums) {
        int k = 0, min = 14, max = 0;
        for (int val : nums) {
            if (val != 0) {
                if ((k & (1 << val)) != 0) {
                    return false;
                }
                k |= (1 << val);
                min = Math.min(min, val);
                max = Math.max(max, val);
            }
        }
        return max - min < 5;
    }
}
