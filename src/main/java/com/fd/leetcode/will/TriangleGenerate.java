package com.fd.leetcode.will;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/** 杨辉三角
 * 举例 第5行的第2个数字 = 第4行的第1个数字 + 第4行的第2个数字
 *  即：第n行的第i个数字 = 第n-1行的第i-1个数字 + 第n-1行的第i个数字
 * @author will
 * @date 2022-05-19 22:02
 */
public class TriangleGenerate {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int n = 0; n < numRows; n++) {
            ArrayList<Integer> rowNumber = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (i == 0 || i == n){
                    rowNumber.add(1);
                }else {
                    rowNumber.add(ans.get(n-1).get(i-1) + ans.get(n-1).get(i));
                }
            }
            ans.add(rowNumber);
        }
        return ans;
    }
}
