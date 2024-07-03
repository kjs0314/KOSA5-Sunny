class Solution {
    public int solution(double num1, double num2) {
        double answer = (num1/num2)*1000;
        int result = (int)answer;
        return result;
    }
}

// answer를 double로 안주면  나눌 때 정수만 나옴 double 해줘야 나눌 때 나머지값(소수)도 나옴
