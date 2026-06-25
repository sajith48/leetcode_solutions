class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoreStack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int lastScore = scoreStack.pop();
                int newScore = lastScore + scoreStack.peek();
                scoreStack.push(lastScore);
                scoreStack.push(newScore);
            } else if (op.equals("D")) {
                scoreStack.push(scoreStack.peek() * 2);
            } else if (op.equals("C")) {
                scoreStack.pop();
            } else {
                scoreStack.push(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        for (int score : scoreStack) {
            totalSum += score;
        }

        return totalSum;
    }
}
