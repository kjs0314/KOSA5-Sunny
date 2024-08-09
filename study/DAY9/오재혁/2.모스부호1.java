import java.util.*;

class Solution {
   public String solution(String letter) {
        String[] Mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        Map<String, String> mosToAlpha = new HashMap<>();

        // 모스 부호와 알파벳 매핑
        for (int i = 0; i < Mos.length; i++) {
            mosToAlpha.put(Mos[i], String.valueOf(alpha.charAt(i)));
        }

        // letter를 공백으로 나눠서 각각의 모스 부호를 처리
        String[] letters = letter.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String morse : letters) {
            answer.append(mosToAlpha.get(morse));
        }

        return answer.toString();
    }
}
