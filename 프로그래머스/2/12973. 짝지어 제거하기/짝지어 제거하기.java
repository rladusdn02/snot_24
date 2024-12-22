import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        // 문자열을 한 글자씩 순회
        for (char c : s.toCharArray()) {
            // 스택이 비어있지 않고, top과 현재 문자가 같으면 제거
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c); // 그렇지 않으면 현재 문자 추가
            }
        }
        
        // 스택이 비어있으면 문자열 제거 성공
        return stack.isEmpty() ? 1 : 0;
    }
}