package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

import entities.Reservation;

public class Project {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("romm: ");
		int number = sc.nextInt();
		System.out.println("Date in: ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("Date out: ");
		Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("erro data de checout vem antes da de check in");
		}else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			System.out.println("Date in: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Date out: ");
			Date checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("difere da data atual constando data antigas");
			}else if(!checkOut.after(checkIn)){
				System.out.println("erro data de checout vem antes da de check in");
			}else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation.toString());	
			}
			
		}
		
	}

}
