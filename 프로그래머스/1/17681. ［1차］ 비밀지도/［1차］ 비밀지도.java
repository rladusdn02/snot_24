import java.lang.Integer;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; // 결과 배열의 크기를 n으로 초기화
        
        for (int i = 0; i < n; i++) {
            // arr1과 arr2의 각 요소를 or 연산한 결과를 이진 문자열로 변환
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            // 이진 문자열 길이를 n에 맞추기 위해 앞쪽에 0을 채움
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            
            // 이진 문자열을 지도 형태로 변환
            StringBuilder line = new StringBuilder();
            for (char ch : binary.toCharArray()) {
                if (ch == '1') {
                    line.append("#"); // 1이면 벽
                } else {
                    line.append(" "); // 0이면 공백
                }
            }
            
            // 변환된 지도를 결과 배열에 저장
            answer[i] = line.toString();
        }
        
        return answer;
    }
}