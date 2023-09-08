package com.javalab.sec04;
/**
 * 아나운서 클래스
 *  - Greeting Interface 인터페이스를 구현한 익명 구현객체를
 *    전달받아서 해당 인삿말을 해주는 메소드 보유
 */

public class Announcer {
	public void announce(Greeting greeting) {
		greeting.greet();
	}

}
