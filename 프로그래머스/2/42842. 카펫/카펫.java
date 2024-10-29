class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cell = brown + yellow; // 전체 카펫

        for (int col = 3; col <= Math.sqrt(cell); col++) { // col은 카펫 높이, 카펫의 루트까지만 탐색
            if (cell % col == 0) { // 세로로 나누어 떨어질 때만
                int row = cell / col; // 가로 구하기
                if ((row - 2) * (col - 2) == yellow) { // 테두리만큼 뺀 경우가 yellow일 때만
                    // 답 저장
                    answer[0] = row;
                    answer[1] = col;
                    break; // 조건을 만족했으므로 탐색 종료
                }
            }
        }
        return answer;
    }
}