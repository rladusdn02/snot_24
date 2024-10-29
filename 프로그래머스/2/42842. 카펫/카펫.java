class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown+yellow; //전체 카펫 면적
        for (int col = 3; col<carpet; col++){ //높이가 3일때부터 탐색시작
            if(carpet%col == 0){ //세로로 나누어떨어질때만
                int row = carpet/col; //가로 구하기
                if((row-2)*(col-2) == yellow){ //테두리만큼 뺀경우가 yellow일때만
                    //답 저장
                    answer[1]=row;
                    answer[0]=col;
                }
            }
        }
        return answer;
    }
}