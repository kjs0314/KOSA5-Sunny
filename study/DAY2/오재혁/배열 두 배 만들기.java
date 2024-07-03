class Solution {
   public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            answer[i] = numbers[i] *2;
        }
        return answer;
    }
}


// 배열 만들 때 int[] answer = {numbers.length}; 로 만들면 answer 배열의 첫 번째 인자에 
// numbers.lenth의 값이 들어가기에 answer 배열의 크기는 하나이다. 
