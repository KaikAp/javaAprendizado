package entities;

public abstract class Taxpayer {
	private String name;
	private Double anualincome;
	
	
	public Taxpayer() {
		
	}


	public Taxpayer(String name, Double anualincome) {
		this.name = name;
		this.anualincome = anualincome;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAnualincome() {
		return anualincome;
	}


	public void setAnualincome(Double anualincome) {
		this.anualincome = anualincome;
	}
	
	
	public abstract double tax();
}
