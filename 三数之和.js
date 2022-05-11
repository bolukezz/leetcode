var threeSum = function(nums) {
    let arr = [],sum = 0
    nums = nums.sort((a,b)=>{return a -b})
    if(nums[0]>0 || nums.length < 3){return []}
    for(let i = 0; i < nums.length;i++){
        if(nums[i]>0){return arr}
        if(i > 0 && nums[i] === nums[i-1]) continue;
        let L = i + 1
        let R = nums.length -1
        while(L < R){
            sum = nums[i] + nums[L] + nums[R]
            if(sum === 0){
                arr.push([nums[i],nums[L], nums[R]])
                while(L<R && nums[L] === nums[L+1]){L++}
                while(L<R && nums[R] === nums[R-1]){R--}
                L++
                R--
            }else if(sum < 0){
                L++
            }else if(sum > 0){
                R--
            }
        }
    }
    return arr
};