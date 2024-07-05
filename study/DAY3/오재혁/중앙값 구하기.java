import java.util.*;

class Solution {
     public int solution(int[] array) {
        int answer = 0;
        int result = 0;
        int min =0;
        Arrays.sort(array);
        answer = array.length;
        min = (answer/2);
        result = array[min];

        return result;
    }
}


// Arrays.sort()  -> 배열 오름차순 정리 
