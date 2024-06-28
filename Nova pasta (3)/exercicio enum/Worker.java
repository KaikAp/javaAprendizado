package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
 private String name;
 private WorkerLevel level;
 private double baseSalary;
 
 private Department department;
 private List<HourContract> contracts = new ArrayList<>();
 //construtores
 public Worker() {
	 
 }

public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
	this.department = department;
}
//getters e setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public WorkerLevel getLevel() {
	return level;
}

public void setLevel(WorkerLevel level) {
	this.level = level;
}

public double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public List<HourContract> getContracts() {
	return contracts;
}
//metodos
public void addContract(HourContract contract) {
	contracts.add(contract); //adiciona um contrato 
}
public void removeContract(HourContract contract) {
	contracts.remove(contract); //remove um contrato
}
 public double income(int year, int month) {
	 double sum = baseSalary;
	 Calendar cal = Calendar.getInstance();
	 for (HourContract c : contracts) {
		 cal.setTime(c.getDate());
		 int c_year =  cal.get(year);
		 int c_month = 1 + cal.get(month);
		if(c_year == year && c_month == month) {
			sum+= c.totalValue();
		}
	}
	 return sum;
 }
}
