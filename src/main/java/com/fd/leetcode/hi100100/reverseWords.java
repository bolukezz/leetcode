package main.java.com.fd.leetcode.hi100100;

/**
 * @author zhoudj
 * @data 2022/4/19  14:08
 */
public class reverseWords {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1;i>=0;--i){
            if(str[i].equals("")){
                continue;
            }
            sb.append(str[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
