
var deleteNode = function(head, val) {
    if(!head) return head
    let headNode = new ListNode(0,head)
    let current = headNode
    while(current && current.next){
        if(current.next.val === val){
            current.next = current.next.next
        }
        current = current.next
    }
    return headNode.next
};