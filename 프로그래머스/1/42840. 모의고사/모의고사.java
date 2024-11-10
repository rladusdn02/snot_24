import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = {0, 0, 0}; // 각 수포자의 점수
        int maxScore = 0; // 최고 점수 추적
        
        // 점수 계산 및 최고 점수 추적
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) score[0]++;
            if (answers[i] == p2[i % p2.length]) score[1]++;
            if (answers[i] == p3[i % p3.length]) score[2]++;
        }
        
        // 최고 점수 계산
        maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최고 점수를 가진 수포자 필터링
        int count = 0;
        for (int s : score) {
            if (s == maxScore) count++;
        }
        
        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                result[idx++] = i + 1; // 수포자 번호는 1부터 시작
            }
        }
        
        return result;
    }
}