class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int [] answer = new int[2]; ;
        int parent = (denom1*denom2);
        int child = (numer1 * denom2)+ (numer2*denom1);
        int result = function(parent, child);
        answer[0] = child /result;
        answer[1] = parent /result;
        return answer;
    }
    public static int function(int p , int q){
        if(q==0) return p;
        return function(q, p%q);
    }
}


// 최대공약수 썼음
