


var cuttingRope = function(n) {
    const dp = new Array(n + 1).fill(1);
    for(let i = 2; i < n + 1; i++){
        for(let j = 1; j < i; j++){
            dp[i] = Math.max(Math.max((i - j) * j, j * dp[i - j]), dp[i]);
        }
    }
    return dp[n];
};