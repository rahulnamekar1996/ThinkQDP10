package com.assingnment.containmentinherisuper;

public class Car {
	

	private int carNo;
	private String brand;
	private String model;
	private Driver driver;

	Car() {

	}

	Car(int carNo, String brand, String model,Driver driver) {
		this.carNo = carNo;
		this.model = model;
		this.brand = brand;
		this.driver=driver;
	}

	public void setCarno(int carNo) {
		this.carNo = carNo;

	}

	public int getCarno() {
		return carNo;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Driver getDriver() {
		return driver;
	}

	public String toString() {
		return "Car_No:" + carNo + " Car_brand:" + brand + " Car_Model:" + model+""+driver;
	}

}
