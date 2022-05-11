var binaryTreePaths = function(root) {
    let res = [];

    if(!root) return []

    var helper = (node, seperate) => {
        if(!node) return;

        if(!node.left && !node.right) {
            res.push(seperate + node.val)
        }

        node.left && helper(node.left, seperate + node.val + "->")
        node.right && helper(node.right, seperate + node.val + "->")
    }
    helper(root, "")

    return res;
};