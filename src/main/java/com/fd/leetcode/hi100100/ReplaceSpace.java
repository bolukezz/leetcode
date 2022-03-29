package main.java.com.fd.leetcode.hi100100;

/**
 * @author zdj
 */
 class ReplaceSpace {
    public String replaceSpace(String s) {
        char a = " ".charAt(0);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);
            if(r == a){
                res.append("%20");
            }else {
                res.append(r);
            }
        }
        return res.toString();
    }
}
