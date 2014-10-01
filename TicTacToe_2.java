import java.util.Scanner;

public class TicTacToe{

	public static void main(String args[]){
		Player playerOne = new Player();
		Player playerTwo = new Player();
		for(int i; i < 9; i++){
			playerOne(args[0]);
			playerTwo(args[1]);
		}
	}
}

class Board{
	public String[][] ticBoard = new String [2][2];

	public boolean avaliableSpace(int spaceInQuestion){
		if(getLetter(spaceInQuestion) != "null"){
			return true;
		}
		
		else{
			return false;
		}
	}

	public void assignSpace(int unusedSpace, String playerLetter){
		if(unusedSpace <= 9 && unusedSpace >= 1){
			if(unusedSpace == 1){
				ticBoard[0][2] = playerLetter;
			}
			
			else if(unusedSpace == 2){
				ticBoard[1][2] = playerLetter;
			}
			
			else if(unusedSpace == 3){
				ticBoard[2][2] = playerLetter;
			}
			
			else if(unusedSpace == 4){
				ticBoard[0][1] = playerLetter;
			}
			
			else if(unusedSpace == 5){
				ticBoard[1][1] = playerLetter;
			}
			
			else if(unusedSpace == 6){ 
				ticBoard[2][1] = playerLetter;
			}

			else if(unusedSpace == 7){
				ticBoard[0][0] = playerLetter;
			}
			
			else if(unusedSpace == 8){
				ticBoard[1][0] = playerLetter;
			}

			else if(unusedSpace == 9){
				ticBoard[2][0] = playerLetter;
			}
		}	
	}

	public boolean victoryChecker(){

	}

	public String getLetter(int coordinateNumber){
		if(coordinateNumber == 1){
			return ticBoard[0][2];
		}
		
		else if(coordinateNumber == 2){
			return ticBoard[1][2];
		}
		
		else if(coordinateNumber == 3){
			return ticBoard[2][2];
		}
		
		else if(coordinateNumber == 4){
			return ticBoard[0][1];
		}
		
		else if(coordinateNumber == 5){
			return ticBoard[1][1];
		}

		else if(coordinateNumber == 6){
			return ticBoard[2][1];
		}

		else if(coordinateNumber == 7){
			return ticBoard[0][0];
		}
		
		else if(coordinateNumber == 8){
			return ticBoard[1][0];
		}

		else if(coordinateNumber == 9){
			return ticBoard[2][0];
		}
	}
}

class TicTacToeBoard{
	public void displayBoard(){
		System.out.println(getLetter(7)	+ "|" + getLetter(8) + "|" + getLetter(9));
		System.out.println("-----");
		System.out.println(getLetter(4) + "|" + getletter(5) + "|" + getLetter(6));
		System.out.println("-----");
		System.out.println(getletter(1) + "|" + getletter(2) + "|" + getletter(3));
	}
}

class Player{
	Scanner keyboard = new Scanner(System.in);
	private String playerLetter;	

	public void playerX(String settingX){
		playerLetter = "X";
		playerOptions(settingX);
	}
	
	public void playerO(String settingO){
		playerLetter = "O";
		playerOptions(settingO);
	}
	
	public void playerOptions(String playerMode){
		boolean legitInput = false;		
		do{
			if(playerMode.equalsIgnoreCase("human")){
				humanInput(keyboard.nextInt());
				legitInput = true;
			}
			
			else if(!playerMode.equalsIgnoreCase("human")){
				aiInput(playerMode);
				legitInput = true;
			}
			
			else{
				System.out.println("Please input two valid player settings in the correct format.");
				legitInput = false;
			}
		}while(legitInput != true);
	}
}

class HumanPlayer{
	boolean correctImput = false;
	public void humanInput(int someCoordinate){
		do{
			if(avaliableSpace(someCoordinate)){
				assignSpace(someCoordinate, playerLetter);
				correctImput = true;
			} 
			else{
				System.out.println("Please enter an open spot between 1 and 9");
				correctImput = false;
			}
		}while(correctImput != true);
	}	
}
class ComputerPlayer{
	public void aiInput(String aiSetting){
		if(aiSetting.equalsIgnoreCase("naive")){
			firstAvaliableSpot();
		}
		
		else if(aiSetting.equalsIgnoreCase("random")){
			randomSpot();
		}
		
		else if(aiSetting.equalsIgnoreCase("cutthroat")){
			cutThroatSpot();
		}
	}
}

class NaiveComputerPlayer{
	public void firstAvaliableSpot(){
		
	}
}

class RandomComputerPlayer{
	public void randomSpot(){

	}
}

class CutThroatComputerPlayer{
	public void cutThroatSpot(){
	
	}
}
