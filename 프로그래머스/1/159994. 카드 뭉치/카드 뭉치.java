import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 카드 뭉치를 큐로 변환
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (String card : cards1) {
            queue1.offer(card);
        }

        for (String card : cards2) {
            queue2.offer(card);
        }

        // goal 배열을 순서대로 확인
        for (String word : goal) {
            if (!queue1.isEmpty() && queue1.peek().equals(word)) {
                queue1.poll(); // 첫 번째 카드 뭉치에서 제거
            } else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                queue2.poll(); // 두 번째 카드 뭉치에서 제거
            } else {
                return "No"; // 두 카드 뭉치에서 모두 사용할 수 없는 경우
            }
        }
        return "Yes";
    }
}