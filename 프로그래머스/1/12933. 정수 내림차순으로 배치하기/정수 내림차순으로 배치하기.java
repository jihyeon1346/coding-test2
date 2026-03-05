import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        
        char[] num = str.toCharArray();
        
        Arrays.sort(num);
        
        StringBuilder answer = new StringBuilder(new String(num));
        
        answer.reverse();
        
        return Long.parseLong(answer.toString());
    }
}