package com.javalab.sec03.Car;

public class Car {
	


	private String name;   //이름
	private String engine; //엔진
	private int length;    //전장
	private int width;     //전폭
	private int height;    //전고
	private int wheelbase; //축거
	private int displacement; //배기량
	private int price;       //가격
	
	


	public Car(String name, String engine, int length, int width, int height, int wheelbase,
			int displacement, int price) {
		super();

		this.name = name;
		this.engine = engine;
		this.length = length;
		this.width = width;
		this.height = height;
		this.wheelbase = wheelbase;
		this.displacement = displacement;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWheelbase() {
		return wheelbase;
	}


	public void setWheelbase(int wheelbase) {
		this.wheelbase = wheelbase;
	}


	public int getDisplacement() {
		return displacement;
	}


	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", length=" + length + ", width=" + width + ", height="
				+ height + ", wheelbase=" + wheelbase + ", displacement=" + displacement + ", price=" + price + "]";
	}
	
	
	
}
