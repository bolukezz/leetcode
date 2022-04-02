
var mirrorTree = function(root) {
    function dfs(node) {
        if(node){
            // 交换节点
            [node.left,node.right] = [node.right, node.left];
            // 每层都交换左右节点
            dfs(node.left);
            dfs(node.right);
        }
    }
    dfs(root);
    return root;
};
