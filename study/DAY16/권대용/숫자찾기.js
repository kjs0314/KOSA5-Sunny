function solution(num, k) {
    var answer = 0;
    const array = numberToArray(num);
    const arrayNum = array.indexOf(k);
    if (arrayNum !== -1) {
        answer = arrayNum + 1;
        return answer;
    } else {
        answer = -1;
        return answer;
    }
}

function numberToArray(n) {
    return String(n).split("").map(Number);
}
