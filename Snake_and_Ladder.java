public class Snake_and_Ladder{
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args){
		int position = 0;
		System.out.println("Player is at position: " + position);

		int number = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Any no.between 1 to 6 = "+ number);

		int option = (int) (Math.floor(Math.random() * 10 )) % 3;
		switch (option) {
			case NO_PLAY:
				position = position;
				System.out.println("Case: No play");
				break;
			case LADDER:
				position = position + number;
				System.out.println("Case: Ladder");
				break;
			case SNAKE:
				position = position - number;
				System.out.println("Case: Snake");
				break;
		}
		System.out.println("Final position: " + position);
	}
}
