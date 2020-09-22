public class Snake_and_Ladder{
	// Constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args){
		//variables
		int position1 = 0;
		int position2 = 0;
		int count = 0;		
		// Computation
		while (!(position1==100 || position2==100)){
			
			int number1 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			
			int option1 = (int) (Math.floor(Math.random() * 10 )) % 3;
			switch (option1) {
				case NO_PLAY:
					position1 = position1;
					
					break;
				case LADDER:
					while(option1==LADDER){
						position1 = position1 + number1; 
						option1 = (int) (Math.floor(Math.random() *10)) %3;
						number1 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
						
						if(position1>100){
							position1 = position1 - number1;
						}
											
					}
					break;
				case SNAKE:
					position1 = position1 - number1;
					
					if(position1 < 0){
						position1 = 0;
					}
					break;
			}
			count++;
			
			int number2 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			
			int option2 = (int) (Math.floor(Math.random() * 10 )) % 3;
			switch (option2) {
				case NO_PLAY:
					position2 = position2;
					
					break;
				case LADDER:
					while(option2==LADDER){
						position2 = position2 + number2;
						option2 = (int) (Math.floor(Math.random() *10)) %3;
						number2 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
						
						if(position2>100){
							position2 = position2 - number2;
						} 					
					}
					break;
				case SNAKE:
					position2 = position2 - number2;
					
					if(position2 < 0){
						position2 = 0;
					}
					break;
			}
			count++;
			
		}
		System.out.println("The total number of times the dice was rolled: "+count);
		if(position1 == 100)
			System.out.println("Player 1 won");
		else if (position2 == 100)
			System.out.println("Player 2 won"); 
	}
}









