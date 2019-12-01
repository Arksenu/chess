class King extends Piece {
	private String king;
	private Boolean white;

	public King(boolean white) {
		this.white = white;
		if (white) {
			king = "  K  ";
		}
		else {
			king = "  k  ";
		}
	}

	public String getName() {
		return king;
	}

	public Boolean getSide() {
		return white;
	}
}
