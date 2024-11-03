// sol1
// import java.util.ArrayList;

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         ArrayList<Integer> trit = new ArrayList<>();
        
//         // 3진수 변환
//         while (n > 0) {
//             int remain = n % 3;
//             n = n / 3;
//             trit.add(remain);
//         }

//         // 10진수로 변환
//         for (int i = 0; i < trit.size(); i++) {
//             answer += trit.get(trit.size() - 1 - i) * Math.pow(3, i);
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int n) {
        int answer = 0;
        int power = 1;

        // n을 3진수로 변환하여 뒤집어서 answer에 더해 줌
        while (n > 0) {
            int remain = n % 3;
            answer = answer * 3 + remain;
            n /= 3;
        }

        return answer;
    }
}