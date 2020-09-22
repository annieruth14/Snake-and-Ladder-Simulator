public class Snake_and_Ladder{
	// Constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args){
		//variables
		int position = 0;
		int count = 0;
		
		// Computation
		while (position!=100){
			count++;
			int number = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			
			int option = (int) (Math.floor(Math.random() * 10 )) % 3;
			switch (option) {
				case NO_PLAY:
					position = position;
					
					break;
				case LADDER:
					position = position + number;
					
					if(position>100){
						position = position - number;
					}
					break;
				case SNAKE:
					position = position - number;
					
					if(position < 0){
						position = 0;
					}
					break;
			}
			System.out.println("Dice roll: "+count+" Position: "+position);
		}
		System.out.println("The total number of times the dice was rolled: "+count);
	}
}















