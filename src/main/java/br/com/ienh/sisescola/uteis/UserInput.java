package br.com.ienh.sisescola.uteis;

import java.util.Scanner;

public class UserInput {
	
	private Scanner scanner;
	
	public UserInput() {
	    scanner = new Scanner(System.in);
	}
	
	public String readText(String prompt) {
	    System.out.println(prompt);
		return scanner.nextLine();
	}
	
	public int readInt(String prompt) {
		System.out.println(prompt);
		return scanner.nextInt();
	}
	
	public double readReal(String prompt) {
		System.out.println(prompt);
		return scanner.nextDouble();
	}
	
}