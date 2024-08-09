class Solution {
 public int solution(int[] numbers, int k) {
        int answer = 0;

        if(((k-1)*2)< numbers.length){
            answer = numbers[(k-1)*2];
        }else {
            k = ((k-1)*2) % numbers.length ;
            answer = numbers[k];
        }

        return answer;
    }
}
