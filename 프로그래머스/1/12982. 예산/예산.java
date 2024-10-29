import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cal = 0;
        Arrays.sort(d);
        for (int i=0; i<d.length; i++){
            cal+= d[i];
            if (cal>budget){
                break;
            }
            answer++;
        }
        return answer;
    }
}