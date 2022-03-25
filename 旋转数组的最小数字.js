

// 二分查找
var minArray = function(numbers) {
    let right = numbers.length - 1
    let left = 0
    while (left < right) {
        if (numbers[left] >= numbers[right]) {
            left++
        } else {
            right--
        }
    }
    return numbers[right]
};

// 一行解法
var minArray = function(numbers) {
    return Math.min(...numbers)
};