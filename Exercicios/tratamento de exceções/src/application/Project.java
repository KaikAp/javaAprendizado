package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

import entities.Reservation;
import model.exceptions.DomainException;

public class Project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			System.out.println("romm: ");
			int number = sc.nextInt();
			System.out.println("Date in: ");
			Date checkin = sdf.parse(sc.next());
			System.out.println("Date out: ");
			Date checkout = sdf.parse(sc.next());
			
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			System.out.println("Date in: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Date out: ");
			Date checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}catch(ParseException e) {
			System.out.println("data fora do formato");
		}catch(DomainException e) {
			System.out.println("Erro na reserva" + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Erro não esperado");
		}
		sc.close();
	}
	
}


