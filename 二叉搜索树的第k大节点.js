

var kthLargest = function(root, k) {
    function mid(node){
        if(!node) return false;

        let right = mid(node.right);
        if(right) return right;

        if(!--k) return res = node.val;;

        let left = mid(node.left);
        if(left) return left;
    }
    return mid(root);
};