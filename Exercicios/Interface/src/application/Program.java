package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("entre com os dados do aluguel: ");
		System.out.println("entre com o nome do carro: ");
		String car = sc.nextLine();
		System.out.println("entre com a retirada(dd/mm/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("entre com a retorno(dd/mm/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental carro = new CarRental(start, finish, new Vehicle(car));
		System.out.println("entre o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("entre o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService service = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		service.processInvoice(carro);
		
		System.out.println("Fatura: ");
		System.out.println(carro.getInvoice().getBasicPayment());
		System.out.println(carro.getInvoice().getTax());
		System.out.println(carro.getInvoice().getTotalPayment());
		sc.close();
	}

}
