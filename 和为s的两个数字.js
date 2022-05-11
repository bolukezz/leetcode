

// 双指针
var twoSum = function(nums, target) {
    let left = 0,
        right = nums.length - 1
    while(left < right) {
        let sum = nums[left] + nums[right]
        // 因为是按升序的数组
        if(sum > target) {
            right --
        } else if(sum < target){
            left ++
        } else {
            return [nums[left], nums[right]]
        }
    }
    return []
};