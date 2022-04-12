

var search = function(nums, target) {
    let map = {}
    for(num of nums) {
        map[num] ? map[num]++ : (map[num] = 1)
    }
    return map[target] || 0
};