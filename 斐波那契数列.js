

var fib = function(n) {
    if(n === 0 || n === 1) {
        return n
    }
    let nums = [0, 1]
    for(let i = 2; i <= n; i++) {
        nums[i] = (nums[i - 1] + nums[i - 2]) % 1000000007
    }
    return nums[n]
};