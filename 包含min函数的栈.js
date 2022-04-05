



var MinStack = function() {
    this.Stack = []
    this.minStack = []
};

/**
 * @param {number} x
 * @return {void}
 */
MinStack.prototype.push = function(x) {
    this.Stack.push(x)
    if(this.minStack.length === 0 || x <= this.minStack[this.minStack.length - 1]){
        this.minStack.push(x)
    }
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    let popVal = this.Stack.pop()
    if( this.minStack[this.minStack.length - 1] === popVal){
        this.minStack.pop()
    }
    return popVal
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.Stack[this.Stack.length - 1];
};

/**
 * @return {number}
 */
MinStack.prototype.min = function() {
    return this.minStack[this.minStack.length - 1]
};