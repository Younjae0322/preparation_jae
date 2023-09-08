package com.javalab.sec04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreetingMain {

	public static void main(String[] args) {
		//아나운서 객체 생성
		Announcer announcer = new Announcer();
		
		
		//영어 인삿말
		Greeting english = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello");
			}
		};
		//프랑스 인삿말
		Greeting france = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Bonjour, le Monde!");
			}
		};
		//한국 인삿말
		Greeting korean = new Greeting() {
			@Override
			public void greet() {
				System.out.println("안녕하세요.!");
			}
		};
		
		List<Greeting> anc = new ArrayList<>();
		anc.add(english);
		anc.add(france);
		anc.add(korean);
		
		for(Greeting greeting : anc) {
			announcer.announce(greeting);
		}
		System.out.println();
		
		Map<String, Greeting> anc1 = new HashMap<>();
		anc1.put("English", english);
		anc1.put("France", france);
		anc1.put("Korean", korean);
		for(Map.Entry<String, Greeting> entry : anc1.entrySet()) {
			String k = entry.getKey();
			Greeting v = entry.getValue();
			System.out.println(k);
            announcer.announce(v);
            System.out.println();
		}
		
		
		Greeting[] gts = new Greeting[3];
		gts[0] = english;
		gts[1] = france;
		gts[2] = korean;
		for(Greeting gt : gts) {
			announcer.announce(gt);
		}
	}
}
