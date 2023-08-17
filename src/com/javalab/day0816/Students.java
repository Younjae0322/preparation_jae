package com.javalab.day0816;

public class Students {
	private String name;
	private int korean;
	private int english;
	private int germany;
	public Students(String name, int korean, int english, int germany) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.germany = germany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getGermany() {
		return germany;
	}
	public void setGermany(int germany) {
		this.germany = germany;
	}
	

}
