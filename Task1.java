import java.util.Scanner;

public class Task1 {
    /* this is the level: 2 task: 1 */
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        /* this is the empty board */
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameover = false;
        Scanner scn = new Scanner(System.in);
        while (!gameover) {
            printboard(board);
            System.out.print("player " + player + " Enter : ");
            int row = scn.nextInt();
            int col = scn.nextInt();
            if (board[row][col] == ' ') {
                // place the elements
                board[row][col] = player;
                gameover = youhavewon(board, player);
                if (gameover) {
                    System.out.println("player " + player + " has won");

                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid Move try again");
            }

        }
        printboard(board);

    }

    public static boolean youhavewon(char[][] board, char player) {
        // check for row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // check for col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // check the digonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;

    }

    public static void printboard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}