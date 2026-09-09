class Solution {
    public boolean isValidSudoku(char[][] board) {
        for ( int i = 0 ; i < 9 ; i++ )
        {
            for ( int j = 0 ; j < 9 ; j++ )
            {
                if (!isValid(i,j,board))
                {
                    return false ;
                }
            }
        }    
    return true ;
    }

    public boolean isValid ( int row , int col , char[][] board )
    {
        if ( board[row][col] == '.')
        {
            return true ;
        }


        for ( int i = 0 ; i < 9 ; i++ )
        {
            if ( i != col && board[row][i] == board[row][col])
            {
                return false ;
            }

            if ( i != row && board[i][col] == board[row][col])
            {
                return false ;
            }

            int SubRow = 3 * (row/3) +i/3;
            int SubCol = 3*(col/3)+i%3;

            if ( SubRow != row && SubCol != col && board[row][col] == board[SubRow][SubCol])
            {
                return false ;
            }

        }
        return true ;
    }
}


