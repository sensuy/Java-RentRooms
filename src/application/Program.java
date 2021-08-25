package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rented = new Rent[10];
		
		System.out.println(rented);
		
		System.out.print("How many rooms will be rented? ");
		int numberOfRooms = sc.nextInt();
		
		for (int i=0; i<numberOfRooms; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			sc.nextLine();
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			rented[room - 1] = new Rent(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < rented.length; i++) {
			if(rented[i] != null) {
				System.out.println(rented[i]);
			}
		}
		
		sc.close();
	}

}
