package pl.blackcat.kursjava.interfejsy;

import java.util.Scanner;

public class Main {

	private Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		Computation computation;

		if (main.shouldMultiply()) {
			computation = new Multiplication();
		}
		else {
			computation = new Addition();
		}

		double argument1 = main.getArgument();
		double argument2 = main.getArgument();

		double result = computation.compute(argument1, argument2);
		System.out.println("Wynik: " + result);
	}

	private boolean shouldMultiply() {
		System.out.print("Czy chcesz wykonać mnożenie? Wybór \"nie\" spowoduje wykonanie dodawania. (y/n): ");
		char type;
		type=scanner.next().charAt(0);
		if (type=='y')
			return true;
		else
			return false;
	}

	private double getArgument() {
		System.out.print("Podaj liczbę: ");
		return scanner.nextDouble();
	}
}
