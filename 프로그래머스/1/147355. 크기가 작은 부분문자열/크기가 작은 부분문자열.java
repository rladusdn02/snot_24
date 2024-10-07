class Solution {
    public int solution(String t, String p) {
        int len = p.length();   // p의 길이
        int result = 0;         // 결과를 저장할 변수
        long pValue = Long.parseLong(p);  // p의 값을 숫자로 변환, 18자리가 최대이므로 Long으로 선언
        for (int i = 0; i <= t.length() - len; i++) {
            // 부분 문자열 추출
            String subStr = t.substring(i, i + len);
            long subValue = Long.parseLong(subStr); // 부분 문자열을 숫자로 변환
            
            // p의 값보다 작거나 같으면 결과 카운트 증가
            if (subValue <= pValue) {
                result++;
            }
        }
        
        return result;  // 결과 반환
    }
}