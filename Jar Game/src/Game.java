import java.util.Random;
import java.util.Scanner;


public class Game {
	public static void main (String[]args){
		
		System.out.printf("ADMINISTRATOR SETUP %n");
		System.out.printf("=================== %n");
		
		Jar jar = new Jar();
		
		jar.readInput();
		jar.writeOutPut();
		
		System.out.printf("PLAYER %n");
		System.out.printf("=================== %n");
		
		jar.writePlayer();
		jar.fill();
		
		jar.applyGuess();
		
		
		
		
	}

}
