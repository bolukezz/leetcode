

var getIntersectionNode = function(headA, headB) {
    let map = new Map()
    while(headA) {
        map.set(headA, 1)
        headA = headA.next
    }
    while(headB) {
        if(map.get(headB)){
            return headB
        }
        headB = headB.next
    }
    return null
};