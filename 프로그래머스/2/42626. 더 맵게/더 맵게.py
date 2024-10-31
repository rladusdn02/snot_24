import heapq

def solution(scoville, K):
    # 힙으로 변환하여 가장 낮은 스코빌 지수를 효율적으로 찾기
    heapq.heapify(scoville)
    mix_count = 0
    
    while scoville[0] < K:
        # 모든 음식을 K 이상으로 만들 수 없는 경우
        if len(scoville) < 2:
            return -1
        # 가장 낮은 두 개의 스코빌 지수를 꺼내서 섞기
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        new_scoville = first + (second * 2)
        heapq.heappush(scoville, new_scoville)
        mix_count += 1
    
    return mix_count