
// [2, 3, 1, 0, 2, 5, 3]
var findRepeatNumber = function(nums) {
    // 创建一个map
    let map = new Map()
    for(let i = 0; i < nums.length; i++) {
        // 判断map中是否已存在
        if(map.has(nums[i])) {
            return nums[i]
        }
        map.set(nums[i], i)
    }
};