import java.lang.Math;
class Move {
	private static Boolean whiteTurn = true;
	private static int totalTurns = 0;
	public static void move(Player player, int startRow, int startCol, int endRow, int endCol) {
		if (whiteTurn == player.getSide() && checkMove(startRow, startCol, endRow, endCol)) {
			Spot target = Board.board[startRow][startCol];
			Board.board[startRow][startCol] = new Spot();
			Board.board[endRow][endCol] = target;
			whiteTurn = !whiteTurn;
			System.out.println(whiteTurn);
			Board.update();
			totalTurns++;
		}
		else {
			System.out.println("ERRORRRR");
		}
	}

	public static Boolean checkMove(int startRow, int startCol, int endRow, int endCol) {
		Spot piece = Board.board[startRow][startCol];
		switch (piece.getPiece().getName().toLowerCase()) {
			case "  p  ": 
			if (totalTurns <= 1 && adjustAndCheck(whiteTurn, startRow, startCol, endRow, endCol, 2, 0)) {
				return true;
			}
			else if(adjustAndCheck(whiteTurn, startRow, startCol, endRow, endCol, 1, 0)) {
				return true;
			}
			break;
			case "  r. ":
		}
		return false;
	}

	private static Boolean adjustAndCheck(boolean white, int startRow, int startCol, int endRow, int endCol, int rowAdjust, int colAdjust) {
		//Pawn movement restriction
		if (white && (endRow+1)-(startRow+1)==rowAdjust && Math.abs((startCol+1)-(endCol+1))==colAdjust && canMove(startRow, startCol, endRow, endCol)) {
			return true;
		}
		else if (!white && (startRow+1)-(endRow+1)==rowAdjust && Math.abs((startCol+1)-(endCol+1))==colAdjust && canMove(startRow, startCol, endRow, endCol)) {	
			return true;
		}
		return false;
	}	

	private static Boolean canMove(int startRow, int startCol, int endRow, int endCol) {
		if (whiteTurn) {
		for (int i = startRow-1; i <= endRow; i--) {
			for (int j = startCol+1; j <= endCol; i++) {
				if (Board.board[i][j].getEmptySpace() != null || Board.board[i][j].getPiece().getSide() == whiteTurn)
					return false;
			}
		}
	}
		if (!whiteTurn) {
			for (int i = startRow+1; i <= endRow; i++) {
			for (int j = startCol+1; j <= endCol; i++) {
				if (Board.board[i][j].getEmptySpace() != null || Board.board[i][j].getPiece().getSide() == whiteTurn)
					return false;
				}
			}
		}
		return true;
	}
}
