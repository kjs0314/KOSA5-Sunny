class Solution {
   public int solution(int n) {
        int answer = 0;
        if(n%7 ==0){
            answer = n/7;
        }else if(n < 7){
            answer = 1;
        }else if(n> 7 ){
            answer = (n/7)+1;
        }else System.out.println("오류오류오류");
        return answer;
    }
}
