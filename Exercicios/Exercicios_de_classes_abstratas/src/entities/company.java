package entities;

public class company extends Taxpayer {
	private Integer numberofemployes;

	public company(String name, Double anualincome, int numberofemployes) {
		super(name, anualincome);
		this.numberofemployes = numberofemployes;
	}
	

	public int getNumberofemployes() {
		return numberofemployes;
	}


	public void setNumberofemployes(int numberofemployes) {
		this.numberofemployes = numberofemployes;
	}


	@Override
	public double tax() {
		
		double result = getNumberofemployes() > 10 ? getAnualincome() * 0.14 : getAnualincome() * 0.16;
		double total = result - getAnualincome();
		return total;
	}
	
	
}
