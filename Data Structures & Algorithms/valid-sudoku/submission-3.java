class Solution {
    public boolean isValidSudoku(char[][] board) {

        for ( int i = 0 ; i < 9 ; i++ )
        {
            for ( int j = 0 ; j < 9 ; j++ )
            {
                if(!isValid(i,j,board))
                {
                    return false;
                }
            }
        }
        return true ;       
    }

    public boolean isValid(int row , int col , char[][] board)
    {
        if ( board[row][col] == '.')
        {
            return true ;
        }
        for ( int i = 0 ; i < 9 ; i++ )
        {
            if(i != col && board[row][i] == board[row][col])
            {
                return false ;
            }

            if(i != row && board[i][col] == board[row][col])
            {
                return false ;
            }

            int Subrow = 3*(row/3) + i/3 ;
            int Subcol = 3*(col/3) + i%3 ;

            if( Subrow != row && Subcol != col && board[Subrow][Subcol] == board[row][col])
            {
                return false ;
            }
        }
        return true ;
    }
}
