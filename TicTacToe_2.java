//List of classes we  have imported. 
import java.util.Scanner;
/*
The main method, here we created two objects of Player and will call methods upon it.
The first input argument is Player X an the second arguement is Player O.
Possible values for first and second argument is Human,Naive, Random, and Cutthroat.  
*/
public class TicTacToe{

    //Diplay "Tic-Tac-Toe Game";

	public static void main(String args[]){
		Player playerOne = new Player();
		Player playerTwo = new Player();
		for(int i; i < 9; i++){
			playerOne(args[0]);
			playerTwo(args[1]);
		}
	}
}
//The interface class that define operations of a game board.
class Board{
	public String[][] ticBoard = new String [2][2];
    //the availableSpace method, this method checks to see if a space is available. 
	public boolean avaliableSpace(int spaceInQuestion){
		if(getLetter(spaceInQuestion) != "null"){
			return true;
		}
		
		else{
			return false;
		}
	}
    //the assignSpace method, this method hardcodes the values of the array we created
    //to make sure they correspond to the correct values of 1-9. 
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
    //the victoryChecker method, in this method we calculated that there are 8 possible wins. 
    //because of this, the method checks to see if the board has any of these possible wins and thus
    //gives  a victor. 
	public boolean victoryChecker(){

	}
    //the getLetter method, this method hardcodes the values of X and O and allows
    //it to be displayed on the board. 
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
// TicTacToeBoard, a Class that implements the Board interface to hold a tic-tac-toe board. 
//this board is represented by a 2-dimensional array. 
class TicTacToeBoard{
	public void displayBoard(){
		System.out.println(getLetter(7)	+ "|" + getLetter(8) + "|" + getLetter(9));
		System.out.println("-----");
		System.out.println(getLetter(4) + "|" + getletter(5) + "|" + getLetter(6));
		System.out.println("-----");
		System.out.println(getletter(1) + "|" + getletter(2) + "|" + getletter(3));
	}
}
//This class represents the a player of the game. 
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
				,				legitInput = true;
			}
			
			else{
				System.out.println("Please input two valid player settings in the correct format.");
				legitInput = false;
			}
		}while(legitInpute != true);
	}
}
//A subclass of Player that represents a human player defined in the previous method. 
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
//A subclass of Player that represents a computer player as defined in previous methods. 
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
/*
A subclass of ComputerPlayer defined above.
Will mark the first available spot on the board starting at the top left square and scanning
each row from left to right. *
*/
class NaiveComputerPlayer{
	public void firstAvaliableSpot(){
		
	}
}
/*
A subclass of ComputerPlayer defined above.
Will mark a random open spot on the board. 
*/ 
class RandomComputerPlayer{
	public void randomSpot(){

	}
}
/*
A subclass of Computer Player defined above.
Will implement an optimal strategy to play tic-tac-toe.
Essentially player can play perfect tic-tac-toe if they choose the move with the highest priority. 
Table: Win, Block,Fork, Block Opponent's Fork, Center, Opposite Corner,Empty Corner, Empty Side.  
*/
class CutThroatComputerPlayer{
	public void cutThroatSpot(){
	
	}
}
