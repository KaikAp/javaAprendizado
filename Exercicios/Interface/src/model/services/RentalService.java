package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.invoice;

public class RentalService {

	private double pricePerDay;
	private double pricePerhour;
	
	private TaxService taxService;

	public RentalService(double pricePerDay, double pricePerhour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerhour = pricePerhour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carrental) {
		double minutes = Duration.between(carrental.getStart(), carrental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <=12.0) {
			basicPayment = pricePerhour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		
		carrental.setInvoice(new invoice(basicPayment, tax));
	}
	
}
