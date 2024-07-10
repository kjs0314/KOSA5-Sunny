import java.util.*;

class Solution {
  public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        ArrayList<Integer> even_num = new ArrayList<Integer>();
        ArrayList<Integer> odd_num =  new ArrayList<Integer>();

        for( int i=0; i<num_list.length; i++){
            if(num_list[i] %2 ==0) {
                even_num.add(num_list[i]);
            }else{
                odd_num.add(num_list[i]);
            }
        }
        answer[0] = even_num.size();
        answer[1] = odd_num.size();

        return answer;
    }
}
