package com.fd.leetcode.hujih;

import com.fd.leetcode.common.ListNode;

/**
 * @description:
 * @author: hjh
 * @date:2022-04-11 20:02
 **/
public class GetIntersectionNode {
    /**
     * @param a
     * @param b
     * @return
     */
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode ta = a, tb = b;
/**如果存在交点：第一条链表首次到达「第一个相交节点」的充要条件是第一条链表走了 a + c + ba+c+b 步，
 由于两条链表同时出发，并且步长相等，因此当第一条链表走了 a + c + ba+c+b 步时，第二条链表同样也是走了 a + c + ba+c+b 步，
 即 第二条同样停在「第一个相交节点」的位置。
 如果不存在交点：两者会在走完 a + c + b + ca+c+b+c 之后同时变为 null，退出循环。*/
        while (ta != tb) {
            //当第一条链表遍历完，移动到第二条链表的头部进行遍历；
            ta = ta == null ? b : ta.next;
            //当第二条链表遍历完，移动到第一条链表的头部进行遍历。
            tb = tb == null ? a : tb.next;
        }
        return ta;
    }
}
