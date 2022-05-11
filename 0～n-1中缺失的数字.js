var missingNumber = function(nums) {
    let n = nums.length;
    let expect = ((0 + n) * (n + 1)) / 2;
    let sum = nums.reduce((prev, next) => prev + next, 0);
    return expect - sum;
};