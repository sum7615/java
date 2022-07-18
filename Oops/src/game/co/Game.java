package game.co;

public class  Game {
	public static void main(String[] args) {
		int position = calculateHighScore(1500);
		displayHighScore("Suman",position);
		int position1 = calculateHighScore(900);
		displayHighScore("Suman",position1);
		int position2 = calculateHighScore(400);
		displayHighScore("Suman",position2);
		int position3 = calculateHighScore(50);
		displayHighScore("Suman",position3);
	}
	public static void displayHighScore(String name, int position) {
		System.out.println(name+" managed to get into position "+position+" on the high score table");
	}
	public static int calculateHighScore(int score) {
		if(score>=1000) {
			return 1;
		}
		else if(500<=score && score<1000) {
		return 2;	
		}
		else if(score<500 && score>=100) {
			return 3;
		}
		else {
			return 4;
		}
	} 
}

