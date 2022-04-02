

import main.java.com.fd.leetcode.common.ListNode;

import java.util.LinkedList;

/**
 * @author zhuyumeng
 * @date 2022/3/21 10:06 上午
 */
public class reversePrint {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int len = stack.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
