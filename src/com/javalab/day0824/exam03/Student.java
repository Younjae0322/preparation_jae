package com.javalab.day0824.exam03;

public class Student {
	private String id;
	private String jumin;
	private String name;
	private int year;
	public Student(String id, String jumin, String name, int year) {
		super();
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", jumin=" + jumin + ", name=" + name + ", year=" + year + "]";
	}
	
	

}
