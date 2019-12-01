class Spot {
	private Piece piece;
	private Boolean empty;
	private String emptySpace;

	public Spot() { 
		emptySpace = " [ ] ";
		empty = true;
		piece = null;
	}

	public Spot(Piece piece) {
		this.piece = piece;
	}

	public void setPiece(Piece spot) {
		this.piece = piece;
	}

	public void setEmpty(Boolean status) {
		empty = status;
	}

	public Piece getPiece() {
		return piece;
	}

	public Boolean getEmpty() {
		return empty;
	}

	public String getEmptySpace() {
		return emptySpace;
	}

}
