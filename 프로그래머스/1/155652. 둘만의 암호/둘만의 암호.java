import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // 알파벳 배열 선언
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> alpha = new ArrayList<>(Arrays.asList(alphabet));
        
        // skip 문자열 제거
        for (int i = 0; i < skip.length(); i++) {
            String ch = String.valueOf(skip.charAt(i));
            alpha.remove(ch);
        }
        
        // s 문자열에서 index만큼 떨어진 알파벳 구하기
        for (int j = 0; j < s.length(); j++) {
            int in = alpha.indexOf(String.valueOf(s.charAt(j))); // 현재 문자 위치
            int result = (in + index) % alpha.size(); // index만큼 이동, 초과 시 순환
            answer += alpha.get(result); // 변환된 문자 추가
        }
        
        return answer;
    }
}