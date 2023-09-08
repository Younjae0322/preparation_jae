package com.javalab.day0824;

interface CanFly{
	void fly();
}

interface CanSwim{
	void swim();
}

class Bird implements CanFly{
	@Override
	public void fly() {   //CanFly 인터페이스 안의 추상형 메소드를 Bird 클래스 fly메소드로 오버라이드함.
		System.out.println("새가 난다.");
	}
}

class Fish implements CanSwim{
	@Override
	public void swim() {  //CanSwim 인터페이스 안의 추상형 메소드를 Fish 클래스 swim메소드로 오버라이드함.
		System.out.println("물고기가 헤엄친다.");
	}
}

public class InterfaceMain {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();  // 출력 : 새가 난다.
		
		Fish fish = new Fish();
		fish.swim();  //출력 : 물고기가 헤엄친다.
	}

}
