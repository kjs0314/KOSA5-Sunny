class Solution {
  public int[] solution(int[] numbers, int num1, int num2) {
        int result = num2 - num1 +1;
        int[] answer = new int[result];
        for(int i=0; i< result; i++){
            answer[i] = numbers[num1+i];
        }
        return answer;
    }
}
