package entities;

public class individual extends Taxpayer {
	
 private Double helthExpenditures;

public individual(String name, Double anualincome, Double helthExpenditures) {
	super(name, anualincome);
	this.helthExpenditures = helthExpenditures;
}

public Double getHelthExpenditures() {
	return helthExpenditures;
}

public void setHelthExpenditures(Double helthExpenditures) {
	this.helthExpenditures = helthExpenditures;
}

@Override
public double tax() {
	
	//double total = (getAnualincome() < 20000.0) ? (getAnualincome()*0.15) : (getAnualincome()*0.25); expressão condicional alternaria
	
	double total;
	
	if(getAnualincome() > 20000) {
		   total = (getAnualincome()*0.15) - (getHelthExpenditures()*0.5);
	}else {
		   total = (getAnualincome()*0.25) - (getHelthExpenditures()*0.5);
	}
	
	return total;
}
}
