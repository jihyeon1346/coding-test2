class Solution {
    public long[] solution(int n, int m) {
        int gcd = gcd(n, m);
        long lcm = (long) n / gcd * (long) m;
        return new long[] { gcd, lcm };
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }    
}