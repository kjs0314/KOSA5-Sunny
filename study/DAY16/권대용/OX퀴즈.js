function solution(quiz) {
    return quiz.map((equation) => {
        const [left, right] = equation.split("=");
        const [x, op, y] = left.trim().split(" ");

        let result;
        if (op === "+") {
            result = parseInt(x) + parseInt(y);
        } else if (op === "-") {
            result = parseInt(x) - parseInt(y);
        }

        return result === parseInt(right.trim()) ? "O" : "X";
    });
}
