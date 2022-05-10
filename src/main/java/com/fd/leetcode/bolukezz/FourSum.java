package main.java.com.fd.leetcode.bolukezz;

import java.util.*;
import java.util.stream.Collectors;

public class FourSum {


    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 2, 2};
        fourSum(nums, 8).forEach(el -> System.out.println(el));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                set.clear();
                for (int k = j + 1; k < nums.length; k++) {
                    if (!set.contains(nums[k])) {
                        set.add(target - nums[i] - nums[j] - nums[k]);
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], target - nums[i] - nums[j] - nums[k]));
                    }
                }
            }
        }
        return res.stream().distinct().collect(Collectors.toList());
    }
}
