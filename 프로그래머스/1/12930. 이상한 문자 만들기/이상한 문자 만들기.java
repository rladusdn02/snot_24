class Solution {
    public String solution(String s) {
        String answer = ""; // 결과를 저장할 변수
        s = s.toLowerCase(); // 모든 문자를 소문자로 변환
        int index = 0; // 각 단어 내에서의 인덱스(짝수/홀수 판단용)

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer += " "; // 공백을 만나면 공백 추가
                index = 0; // 단어 경계이므로 인덱스를 초기화
            } else {
                // 짝수 인덱스면 대문자, 홀수 인덱스면 소문자
                if (index % 2 == 0) {
                    answer += Character.toUpperCase(ch); // 짝수 인덱스: 대문자 변환
                } else {
                    answer += ch; // 홀수 인덱스: 소문자 그대로 추가
                }
                index++; // 공백이 아닐 경우에만 인덱스 증가
            }
        }
        
        return answer;
    }
}