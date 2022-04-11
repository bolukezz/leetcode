


var maxSubArray = function(nums) {
    let item = 0, max = nums[0];
    nums.forEach((x) => {
        item = Math.max(item + x, x);
        max = Math.max(max, item);
    });
    return max
};