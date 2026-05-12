class Solution {
    public int solution(int n) {
        int result = 0;
        while (n > 0) {
            int rem = n % 3;
            result = result * 3 + rem;
            n /= 3;
        }
        return result;
    }
}