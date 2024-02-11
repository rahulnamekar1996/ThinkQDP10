package com.assingnment.containmentinherisuper;

public class Driver {
	private int did;
	private String dname;
	private long adhar;
	private double salary;

	Driver() {

	}

	Driver(int did, String dname, long adhar,double salary) {
		this.did=did;
		this.dname=dname;
		this.adhar=adhar;
		this.salary=salary;
		
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return " Driver_id:"+did+" Driver_Name:"+dname+" Adhar:"+adhar+" Salary:"+salary;
	}

}
