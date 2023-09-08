package com.javalab.day0824.exam03;

public class Professor {
	private String id;
	private String jumin;
	private String name;
	private int department;
	public Professor(String id, String jumin, String name, int department) {
		super();
		this.id = id;
		this.jumin = jumin;
		this.name = name;
		this.department = department;
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
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", jumin=" + jumin + ", name=" + name + ", department=" + department + "]";
	}
	
}
