import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // score 배열을 오름차순으로 정렬
        Arrays.sort(score);
        
        // 뒤에서부터 m개씩 묶어서 최저 점수를 이용해 이익 계산
        for (int i = score.length - m; i >= 0; i -= m) {
            // 각 상자의 최저 점수는 묶은 m개 중 첫 번째 요소
            int minScore = score[i];
            answer += minScore * m;
        }
        
        return answer;
    }
}