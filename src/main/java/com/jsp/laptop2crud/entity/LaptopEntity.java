package com.jsp.laptop2crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LaptopEntity {
	private String nameString;
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int price;
	private int ram;
	private int rom;
	private String verstionString;
	private String colorString;
	private double weight;

	public LaptopEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getVerstionString() {
		return verstionString;
	}

	public void setVerstionString(String verstionString) {
		this.verstionString = verstionString;
	}

	public String getColorString() {
		return colorString;
	}

	public void setColorString(String colorString) {
		this.colorString = colorString;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "LaptopEntity [nameString=" + nameString + ", id=" + id + ", price=" + price + ", ram=" + ram + ", rom="
				+ rom + ", verstionString=" + verstionString + ", colorString=" + colorString + ", weight=" + weight
				+ "]";
	}
}
