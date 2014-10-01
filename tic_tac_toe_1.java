import java.util.Scanner;

public class TicTacToe{

	public static void main(String args[]){
		int xCoordinate = 0;
		int yCoordinate = 0;
	}
}

public class Board{
	public String[][] ticBoard = new String [2][2];

	public boolean avaliableSpace(int spaceInQuestion){
		if(getLetter(spaceInQuestion) != "null"){
			return true;
		}
		
		else{
			return false;
		}
	}

	public assignSpace(int unusedSpace, String playerLetter){
		if(unusedSpace <= 9 && unusedSpace >= 1){
			if(unusedSpace == 1){
				ticBoard[0][2] = playerLetter;
			}
			
			if(unusedSpace == 2){
				ticBoard[1][2] = playerLetter;
			}
			
			if(unusedSpace == 3){
				ticBoard[2][2] = playerLetter;
			}
			
			if(unusedSpace == 4){
				ticBoard[0][1] = playerLetter;
			}
			
			if(unusedSpace == 5){
				ticBoard[1][1] = playerLetter;
			}
			
			if(unusedSpace == 6){ 
				ticBoard[2][1] = playerLetter;
			}

			if(unusedSpace == 7){
				ticBoard[0][0] = playerLetter;
			}
			
			if(unusedSpace == 8){
				ticBoard[1][0] = playerLetter;
			}

			if(unusedSpace == 9){
				ticBoard[2][0] = playerLetter;
			}
		}	
	}

	public victoryChecker(){

	}

	public getLetter(int coordinateNumber){
		if(coordinateNumber == 1){
			return ticBoard[0][2];
		}
		
		if else(coordinateNumber == 2){
			return ticBoard[1][2];
		}
		
		if else(coordinateNumber == 3){
			return ticBoard[2][2];
		}
		
		if else(coordinateNumber == 4){
			return ticBoard[0][1];
		}
		
		if else(coordinateNumber == 5){
			return ticBoard[1][1];
		}

		if else(coordinateNumber == 6){
			return ticBoard[2][1];
		}

		if else(coordinateNumber == 7){
			return ticBoard[0][0];
		}
		
		if else(coordinateNumber == 8){
			return ticBoard[1][0];
		}

		if else(coordinateNumber == 9){
			return ticBoard[2][0];
		}
	}
}

public class TicTacToeBoard{
	public displayBoard(){
		System.out.println(getLetter(7)	+ "|" + getLetter(8) + "|" + getLetter(9));
		System.out.println("-----");
		System.out.println(getLetter(4) + "|" + getletter(5) + "|" + getLetter(6));
		System.out.println("-----");
		System.out.println(getletter(1) + "|" + getletter(2) + "|" + getletter(3)):
	}
}

public class Player{
	Scanner keyboard = new Scanner(System.in);
	private String playerLetter;	

	public playerX(String settingX){
		playerLetter = X;
		playerOptions(settingX);
	}
	
	public playerO(String settingO){
		playerLetter = O;
		playerOptions(settingO);
	}
	
	public playerOptions(String playerMode){
		private boolean legitInput = false;
		
		do{
			if(playerMode.equalsIgnoreCase("human")){
				humanInput(keyboard.nextInt());
				legitInput = true;
			}
			
			if else(!playerMode.equalsIgnoreCase("human"){
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

public class HumanPlayer{
	public boolean correctImput = false;
	public humanInput(int someCoordinate){
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

public class ComputerPlayer{
	public aiInput(String aiSetting){
		if(aiSetting.equalsIgnoreCase("naive")){
			firstAvaliableSpot();
		}
		
		if else(aiSetting.equalsIgnoreCase("random")){
			randomSpot();
		}
		
		if else(aiSetting.equalsIgnoreCase("cutthroat")){
			cutThroatSpot();
		}
	}
}

public class NaiveComputerPlayer{
	public firstAvaliableSpot(){
	
	}
}

public class RandomComputerPlayer{
	public randomSpot(){

	}
}

public class CutThroatComputerPlayer{
	public cutThroatSpot(){
	
	}
}
