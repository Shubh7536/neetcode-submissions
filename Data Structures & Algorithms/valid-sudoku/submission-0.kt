class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val set = HashSet<String>()

        for(row in 0..8){

            for (column in 0..8){

                if(board[row][column] == '.')
                    continue


                // adding row in set
                if(!set.add("${board[row][column]} in row $row"))
                    return false

                if(!set.add("${board[row][column]} in col $column"))
                    return false
                   
                if(!set.add("${board[row][column]} in sb ${(row/3)}+${(column/3)}"))
                    return false
                

            }

        }

        return true
    }
}
