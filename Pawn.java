class Pawn extends Piece {
	private String pawn;
	private Boolean white;

	public Pawn(boolean white) {
		this.white = white;
		if (white) {
			pawn = "  P  ";
		}
		else {
			pawn = "  p  ";
		}
	}

	public String getName() {
		return pawn;
	}

	public Boolean getSide() {
		return white;
	}
}
	
