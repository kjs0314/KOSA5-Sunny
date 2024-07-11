class Solution {
   public String solution(String my_string, int n) {
        String answer = "";
        char[] my_string_arr =my_string.toCharArray();

        for(int i=0; i<my_string_arr.length; i++){
            for(int j=0; j<n; j++){
                answer += String.valueOf(my_string_arr[i]);
            }
           
        }

        return answer;
    }
}
