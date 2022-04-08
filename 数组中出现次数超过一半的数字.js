
let nums = [1, 2, 3, 2, 2, 2, 5, 4, 2]
var majorityElement = function(nums) {
    const length = nums.length
    const map = new Map()
    nums.forEach((num)=>{
        if(map.has(num)) {
            map.set(num, map.get(num) + 1)
        } else {
            map.set(num, 1)
        }
    })
    console.log(map);
    for(let item of map) {
        if(item[1] > length / 2) {
            return item[0]
        }
    }
};

console.log(majorityElement(nums));