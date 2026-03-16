class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String hide = "*".repeat(len - 4);
        String lastNum = phone_number.substring(len - 4);
        return answer = hide + lastNum;
    }
}