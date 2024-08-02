package model.entities;

public class invoice {
	private double basicPayment;
	private double tax;
	
	
	public invoice() {
		
	}


	public invoice(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}


	public double getBasicPayment() {
		return basicPayment;
	}


	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
