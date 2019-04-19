public class TicTacToe {
    /**
     * Checks if the game of TicTacToe ended
     * either because a player has won, or if the game has ended as a tie.
     * If game hasn't ended the return string has to be "None",
     * If the game ends as tie, the return string has to be "Tie",
     * If the game ends because there's a winner, it should return "X wins" or "O wins" accordingly
     *
     * @param grid 2D array of characters representing the game board
     * @return String indicating the outcome of the game: "X wins" or "O wins" or "Tie" or "None"
     * <p>
     * '-' represents an empty space
     */


    public String checkGameWinner(char[][] grid) {
        String result = "None";
        char winner;
        char emptySpot = '-';

        for (int i = 0; i < grid.length; i++) {
            // Check the horizontal axis
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != '-') {
                winner = Character.toUpperCase(grid[0][i]);
                result = winner + " wins";
                break;
            }
            // Check the vertical axis
            else if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != '-') {
                winner = Character.toUpperCase(grid[i][0]);
                result = winner + " wins";
                break;
            }
            // Check the diagonal
            else if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[1][1] != '-') ||
                    (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && grid[1][1] != '-')) {
                winner = Character.toUpperCase(grid[1][1]);
                result = winner + " wins";
                break;
            }
            // Check the tie case "Tie"
            else if (emptySpot == 0) { //Assume freeSpots "-" = 0
                result = "Tie";
                break;
            }
        }
        return result;

    }

}


