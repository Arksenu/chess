class Game {
	public static void main(String[] args) {
		Board.printBoard();

		Player player = new Player(true);
		Player player2 = new Player(false);

		Move.move(player, 1, 4, 3, 4);

		Move.move(player2, 6, 1, 4, 1);



	}
}
