package main.java.com.fd.leetcode.yanL;

public class MinStack {

    int[] arr = new int[999];
    int index = -1;
    int min = 0;

    public MinStack() {

    }

    public void push(int x) {
        arr[++index] = x;
    }

    public void pop() {
        arr[index--] = 0;
    }

    public int top() {
        return arr[index];
    }

    public int min() {
        min = arr[0];
        for (int i = 1; i <= index; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}
