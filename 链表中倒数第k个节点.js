
// 双指针
var getKthFromEnd = function(head, k) {
    // 快指针
    let fast = head
    // 慢指针
    let slow = head
    while(k > 0) {
        fast = fast.next
        k--
    }
    while(fast !== null) {
        fast = fast.next
        slow = slow.next
    }
    return slow
};