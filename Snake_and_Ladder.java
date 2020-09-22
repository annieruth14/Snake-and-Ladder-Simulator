public class Snake_and_Ladder{
	public static void main(String[] args){
		// variables
		int position = 0;
		System.out.println("Player is at position: " + position);
		// Computation
		int number = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Any no.between 1 to 6 = "+ number);
	}
}
