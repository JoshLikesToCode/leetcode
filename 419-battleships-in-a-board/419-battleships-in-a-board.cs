public class Solution {
    public int CountBattleships(char[][] board) {
        int res = 0;
        for(int i = 0; i < board.Length; i++)
        {
            for(int j = 0; j < board[0].Length; j++)
            {
                if(board[i][j] == 'X') // dfs
                {
                    dfs(i, j, board.Length, board[0].Length, board);
                    res++;
                }
            }
        }
        return res;
    }
    
    public void dfs(int i, int j, int row, int col, char[][] board)
    {
        board[i][j] = 'x';
        if(j + 1 < col && board[i][j+1] == 'X')
            dfs(i, j + 1, row, col, board);
        else if(j - 1 >= 0 && board[i][j-1] == 'X')
            dfs(i, j - 1, row, col, board);
        else if(i - 1 >= 0 && board[i-1][j] == 'X')
            dfs(i - 1, j, row, col, board);
        else if(i + 1 < row && board[i+1][j] == 'X')
            dfs(i + 1, j, row, col, board);
    }
}
