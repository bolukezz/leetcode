

var isSymmetric = function(root) {
    if (!root) return true
    function dp(nodeL, nodeR) {
        // 判断是否左右都为空，反true
        if(!nodeL && !nodeR) return true
        if(nodeL && nodeR && nodeL.val === nodeR.val) {
            // 对比的是对称的
            return dp(nodeL?.left,nodeR?.right) && dp(nodeR?.left,nodeL?.right)
        } else {
            return false
        }
    }
    return dp(root?.left, root?.right)
};