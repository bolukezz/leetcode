


var reverseWords = function(s) {
    let arr = s.split(' '),ans = []
    for(let i = arr.length - 1; i >= 0; i --) {
        let item = arr[i].trim()
        if( item != '' ) {
            ans.push(item)
        }
    }
    return ans.join(' ');
};