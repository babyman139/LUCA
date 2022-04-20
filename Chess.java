package week_13;

import java.util.*;

interface Movable {
	boolean canMoveTo(int x, int y);

	void moveTo(int x, int y);
}

class Board {
	private String[][] grid;

	public Board() {
		grid = new String[10][10];
		initializeBoard();
	}

	public void initializeBoard() {
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {

				grid[row][column] = "- ";

				if (grid[row][column] == grid[0][0] || grid[row][column] == grid[0][9]
						|| grid[row][column] == grid[9][0] || grid[row][column] == grid[9][9]) {
					grid[row][column] = "  ";
				} else if (grid[row][column] == grid[1][0] || grid[row][column] == grid[1][9]) {
					grid[row][column] = "1 ";
				} else if (grid[row][column] == grid[2][0] || grid[row][column] == grid[2][9]) {
					grid[row][column] = "2 ";
				} else if (grid[row][column] == grid[3][0] || grid[row][column] == grid[3][9]) {
					grid[row][column] = "3 ";
				} else if (grid[row][column] == grid[4][0] || grid[row][column] == grid[4][9]) {
					grid[row][column] = "4 ";
				} else if (grid[row][column] == grid[5][0] || grid[row][column] == grid[5][9]) {
					grid[row][column] = "5 ";
				} else if (grid[row][column] == grid[6][0] || grid[row][column] == grid[6][9]) {
					grid[row][column] = "6 ";
				} else if (grid[row][column] == grid[7][0] || grid[row][column] == grid[7][9]) {
					grid[row][column] = "7 ";
				} else if (grid[row][column] == grid[8][0] || grid[row][column] == grid[8][9]) {
					grid[row][column] = "8 ";
				}

				else if (grid[row][column] == grid[0][1] || grid[row][column] == grid[9][1]) {
					grid[row][column] = "1 ";
				} else if (grid[row][column] == grid[0][2] || grid[row][column] == grid[9][2]) {
					grid[row][column] = "2 ";
				} else if (grid[row][column] == grid[0][3] || grid[row][column] == grid[9][3]) {
					grid[row][column] = "3 ";
				} else if (grid[row][column] == grid[0][4] || grid[row][column] == grid[9][4]) {
					grid[row][column] = "4 ";
				} else if (grid[row][column] == grid[0][5] || grid[row][column] == grid[9][5]) {
					grid[row][column] = "5 ";
				} else if (grid[row][column] == grid[0][6] || grid[row][column] == grid[9][6]) {
					grid[row][column] = "6 ";
				} else if (grid[row][column] == grid[0][7] || grid[row][column] == grid[9][7]) {
					grid[row][column] = "7 ";
				} else if (grid[row][column] == grid[0][8] || grid[row][column] == grid[9][8]) {
					grid[row][column] = "8 ";
				}

				else if (grid[row][column] == grid[1][1] || grid[row][column] == grid[1][8]) {
					grid[row][column] = "RO";
				} else if (grid[row][column] == grid[1][2] || grid[row][column] == grid[1][7]) {
					grid[row][column] = "KN";
				} else if (grid[row][column] == grid[1][3] || grid[row][column] == grid[1][6]) {
					grid[row][column] = "BI";
				} else if (grid[row][column] == grid[1][4]) {
					grid[row][column] = "QU";
				} else if (grid[row][column] == grid[1][5]) {
					grid[row][column] = "KI";
				} else if (grid[row][column] == grid[2][1] || grid[row][column] == grid[2][2] || grid[row][column] == grid[2][3] || grid[row][column] == grid[2][4] || grid[row][column] == grid[2][5] || grid[row][column] == grid[2][6] || grid[row][column] == grid[2][7] || grid[row][column] == grid[2][8]) {
					grid[row][column] = "PA";
				}

				else if (grid[row][column] == grid[8][1] || grid[row][column] == grid[8][8]) {
					grid[row][column] = "ro";
				} else if (grid[row][column] == grid[8][2] || grid[row][column] == grid[8][7]) {
					grid[row][column] = "kn";
				} else if (grid[row][column] == grid[8][3] || grid[row][column] == grid[8][6]) {
					grid[row][column] = "bi";
				} else if (grid[row][column] == grid[8][4]) {
					grid[row][column] = "qu";
				} else if (grid[row][column] == grid[8][5]) {
					grid[row][column] = "ki";
				} else if (grid[row][column] == grid[7][1] || grid[row][column] == grid[7][2] || grid[row][column] == grid[7][3] || grid[row][column] == grid[7][4] || grid[row][column] == grid[7][5] || grid[row][column] == grid[7][6] || grid[row][column] == grid[7][7] || grid[row][column] == grid[7][8]) {
					grid[row][column] = "pa";
				}
			}
		}
	}

	public void printBoard() {
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 10; column++)
				System.out.print(grid[row][column] + " ");
			System.out.println();
		}
	}
}

public class Chess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board bo = new Board();
//		White wh = new White();
//		Black bl = new Black();
		int i = 0;

		bo.printBoard();
//		while (i == 0) {
//				
//			System.out.println("White to move: input the coordinates of the piece you would like to move:");
//			String coords1 = scan.nextLine();
//			String[] parts1 = coords1.split(" ");
//			wh.wChoosePiece(Integer.valueOf(parts1[0]), Integer.valueOf(parts1[1]));
//				// add white later for now skip to black to move
//			System.out.println("Black to move: input the coordinates of the piece you would like to move:");
//			String coords2 = scan.nextLine();
//			String[] parts2 = coords2.split(" ");
//			bl.bChoosePiece(Integer.valueOf(parts2[0]), Integer.valueOf(parts2[1]));
//		}
		

	}
}
