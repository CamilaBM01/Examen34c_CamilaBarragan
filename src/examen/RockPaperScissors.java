package examen;

import java.util.*;
/**
 * La clase RockPaperScissors se trata de una clase que recibe dos strings mediante scanners y simula el juego de "piedra, papel o tijera".
 * @author Camila
 * @version 1.0
 */
public class RockPaperScissors {
	//Keyboard es el primer atributo static inicializado a 0.
	private static int keyboard = 0;
	//scanner recibe nuestra respuesta
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * Se encarga de almacenar las 3 opciones en una lista de tipo array.list
	 */
	public static List<String> optionList;
	/**
	 * Es un constructor vacio.
	 */
	public RockPaperScissors() {
	}
	
	/**
	 * Al ejecutar la clase nos recibe con un print de bienvenida y la opcion de elegir que queremos tirar, con un numero del 1 al 3.
	 * @param args
	 */
	public static void main(String[] args) {
		optionList = Arrays.asList("Rock", "Paper", "Scissors");
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(computerChoice, userChoice));
		scanner.close();
	}
	
	/**
	 * Este método recibe la opcion que hemos elegido y la opcion que ha generado el anterior metodo de forma aleatoria.
	 * Despues hace las comparaciones necesarias para determinar cual es el ganador, y manda el print que lo indica
	 * @param userChoice
	 * @param computerChoice
	 * @return gameResult
	 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}