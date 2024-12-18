class Solution {
    private int count = 0; // 타겟 넘버를 만드는 방법의 수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0); // 초기 호출
        return count;
    }

    private void dfs(int[] numbers, int target, int index, int currentSum) {
        // 모든 숫자를 사용한 경우
        if (index == numbers.length) {
            if (currentSum == target) {
                count++; // 타겟과 현재 합이 같으면 방법의 수 증가
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, index + 1, currentSum + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(numbers, target, index + 1, currentSum - numbers[index]);
    }
}