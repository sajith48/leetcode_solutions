class Solution {
     public List<List<String>> solveNQueens(int n) {
        List<List<String>> al = new ArrayList<>();
        char[][] queen = new char[n][n];
        for (int i = 0; i < queen.length; i++) {
            Arrays.fill(queen[i], '.');
        }
        solveUntill(queen, al, 0); 
        return al;
    }

    public boolean isValid(char[][] queen, int row, int col) {
        for (int i = col - 1; i >= 0; i--) {
            if (queen[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (queen[i][j] == 'Q') return false;
        }
        for (int i = row + 1, j = col - 1; i < queen.length && j >= 0; i++, j--) { 
            if (queen[i][j] == 'Q') return false;
        }
        return true;
    }

    public void solveUntill(char[][] queen, List<List<String>> al, int index) {
        if (index == queen.length) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < queen.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < queen[i].length; j++) {
                    sb.append(queen[i][j]);
                }
                temp.add(sb.toString());
            }
            al.add(temp);
            return;
        }

        for (int row = 0; row < queen.length; row++) {
            if (isValid(queen, row, index)) {
                queen[row][index] = 'Q';          
                solveUntill(queen, al, index + 1); 
                queen[row][index] = '.';          
            }
        }
    }
}