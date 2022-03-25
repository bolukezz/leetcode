package com.fd.leetcode.hujih;

/**
 * @description: 旋转数组
 * @author: hjh
 * @date:2022-03-25 14:40
 **/
public class RotateArray {

    public int getRotateArray(int[] numbers) {
        //定义左右边界
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            //定义中间点
            int m = (i + j) / 2;
            //如果左数组值大于右 则左下标加一
            if (numbers[m] > numbers[j]){
                i = m + 1;
            }
            //否则右下标加一并替换右边界
            else if (numbers[m] < numbers[j]){
                j = m;
            } else {
                //存在相等情况下，则放弃二分法查找
                int x = i;
                for(int k = i + 1; k < j; k++) {
                    if(numbers[k] < numbers[x]){
                        x = k;
                    }
                }
                return numbers[x];
            }
        }
        return numbers[i];
    }

}
