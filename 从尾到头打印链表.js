

var reversePrint = function(head) {
    // 定义一个栈
    let stack1 = [],stack2 = []
    let num = 0
    while (head) {
        // 进栈
        stack1.push(head.val)
        num++
        head = head.next
    }
    for (let i = num - 1; i >=0; i--) {
        // 出栈
        stack2.push(stack1[i])
    }
    return stack2
};


var reversePrint = function(head) {
    // 定义一个栈
    let stack1 = []
    while (head) {
        stack1.push(head.val)
        head = head.next
    }
    return stack1.reverse()
};