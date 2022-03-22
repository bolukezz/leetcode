

var CQueue = function() {
    // 一个进栈
    this.Stack1 = []
    // 一个出栈
    this.Stack2 = []
};

/**
 * @param {number} value
 * @return {void}
 */
CQueue.prototype.appendTail = function(value) {
    // 进栈
    this.Stack1.push(value)
};

/**
 * @return {number}
 */
CQueue.prototype.deleteHead = function() {
    // 判断出栈中是否有数据
    if(this.Stack2.length > 0) {
        return this.Stack2.pop()
    } else {
        // 出栈中没有数据就从入栈中把先进入的弹到栈顶
        while(this.Stack1.length) {
            this.Stack2.push(this.Stack1.pop())
        }
        if(this.Stack2.length === 0) {
            return -1
        }
        return this.Stack2.pop();
    }
};