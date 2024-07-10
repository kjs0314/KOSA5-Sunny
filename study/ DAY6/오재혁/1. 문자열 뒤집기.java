class Solution {
   public String solution(String my_string) {
        char[] change = my_string.toCharArray();
        char[] reverse_change = new char[my_string.length()];
        for(int i = 0 ; i < my_string.length() ; i++ ){
            reverse_change[i] = change[my_string.length()-i-1];
        }
       
        return String.valueOf(reverse_change);
    }
}
