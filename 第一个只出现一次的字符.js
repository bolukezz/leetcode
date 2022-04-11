

var firstUniqChar = function(s) {
    if(!s || s.length === 0) return ' '
    let strMap = new Map()
    for(let i = 0; i < s.length; i++) {
        strMap.set(s[i], strMap.has(s[i]) ? strMap.get(s[i]) + 1 : 1)
    }
    for(let item of strMap) {
        if(item[1] === 1) {
            return item[0]
        }
    }
    return " "
};