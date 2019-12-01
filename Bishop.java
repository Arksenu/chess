class Bishop extends Piece {
	private String bishop;
	private Boolean white;

	public Bishop(boolean white) {
		this.white = white;
		if (white)
			bishop = "  B  ";
		else
			bishop = "  b  ";
	}

	public String getName() {
		return bishop;
	}

	public Boolean getSide() {
		return white;
	}
}
