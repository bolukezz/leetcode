var exchange = function(nums) {
    let l = 0
    let r = nums.length - 1
    while(l < r) {
        if(nums[l] % 2 !== 0) {
            l++
        } else if(nums[r] % 2 === 0) {
            r--
        } else if(nums[r] % 2 !== 0) {
            [nums[l], nums[r]] = [nums[r], nums[l]]
            l++
            r--
        }
    }
    return nums
};