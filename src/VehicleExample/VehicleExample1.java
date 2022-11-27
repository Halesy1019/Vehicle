package VehicleExample;

import java.util.HashMap;
//You are a car dealer. Create a hash map of vehicles.
//The model is the Key, the make is the Value.
//Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, 
//and what make it is.
//(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
import java.util.Scanner;

public class VehicleExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create HashMap of vehicles: models and make
		HashMap<String, String> carList = new HashMap<String, String>();

		// Add Keys and Values(Model and Make)((Make is the brand aka Toyota, Lexus,
		// etc.. Model is the kind aka Camry, Corolla, etc..
		carList.put("Camry", "Toyota");
		carList.put("Corolla", "Toyota");
		carList.put("Camry Sport", "Toyota");
		carList.put("GR86", "Toyota");
		carList.put("Supra", "Toyota");
		carList.put("Escalade", "Cadillac");
		carList.put("IS 500", "Lexus");
		// Output of
		System.out.println("Hey! What model car are you looking for today?");
		// Accept user input
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		// Answering user input
		System.out.println("Awesome! You asked for a " + userInput + ".\nLet me check and see if we have that.");
		// Condition if/else
		if (carList.containsKey(userInput)) {
			System.out.println("Great, that car is made by " + carList.get(userInput) + ".");

		} else {
			System.out.println("Oh, I'm so sorry, we don't carry that model.");
		}

		input.close();
	}

}
