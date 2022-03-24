package com.fd.leetcode.hujih;

/**
 * @description: 青蛙跳台阶
 * @author: hjh
 * @date:2022-03-24 15:56
 **/
public class NumWays {

    public int numWays(int n) {
        return getStep(n);
    }

    public int getStep(int n){
        if(n<2){
            return 1;
        }
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            a=a+b;
            b=a-b;
            a=a>=1000000007?(a-1000000007):a;
        }
        return a;
    }
}
