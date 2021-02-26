package io.plansoft.gestionale.aziendale.esercitazione.gestionale.aziendale.dipendente;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.plansoft.gestionale.aziendale.esercitazione.gestionale.aziendale.Position;


@Entity
public class Employee {

	
	@Id
	private int id;
	private String name;
	private String lastname;
	private Position position;
	private TimeBank timeBank;
	private PayRoll payRoll;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String lastname, Position position, TimeBank timeBank, PayRoll payRoll) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.position = position;
		this.timeBank = timeBank;
		this.payRoll = payRoll;
	}







	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}




	public TimeBank getTimeBank() {
		return timeBank;
	}




	public void setTimeBank(TimeBank timeBank) {
		this.timeBank = timeBank;
	}

	public PayRoll getPayRoll() {
		return payRoll;
	}

	public void setPayRoll(PayRoll payRoll) {
		this.payRoll = payRoll;
	}
	
	
	
}
