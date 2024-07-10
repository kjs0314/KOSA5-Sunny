class Solution {
       public int solution(int n) {
        int answer = 0;
        int k=1;
        while(((k*6) %n ) != 0){
            k++;
        }
        return k;
    }
}
