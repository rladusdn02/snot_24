import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i<name.length; i++){ //그리움점수 맵
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            String[] persons = photo[i]; //사진별 배열
            int score = 0;
            
            for(int j=0; j<persons.length; j++){ //사람마다
            	
                String person = persons[j];
                if(map.containsKey(person)){ //그리움점수가 있는경우
                    score+=map.get(person); //점수 추가
                }
            }
            answer[i]=score;
        }
        return answer;
    }
}