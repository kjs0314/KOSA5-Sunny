function solution(n) {
    var answer = 0;
    const numArr = numberToArray(n);
    for (let i = 0; i < numArr.length; i++) {
        answer = answer + numArr[i];
    }
    return answer;
}

function numberToArray(n) {
    return String(n).split("").map(Number);
}
