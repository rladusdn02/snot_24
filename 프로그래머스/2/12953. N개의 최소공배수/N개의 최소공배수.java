class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; // 첫 번째 원소로 초기화
        
        // 모든 원소에 대해 최소공배수를 순차적으로 계산
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    // 두 수의 최소공배수를 구함
    private int lcm(int a, int b) {
        return a * (b / gcd(a, b)); // LCM(a, b) = a * (b / GCD(a, b))를 활용
    }
    
    // 최대공약수를 구함 (유클리드 호제법)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}