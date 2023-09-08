package com.javalab.day0824.exam03;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<Student>();
		List<Professor> pro = new ArrayList<Professor>();
		List<Department> dep = new ArrayList<Department>();
		List<Takes> take = new ArrayList<Takes>();
		
		std.add(new Student("1514", "950622-1256789", "홍길동", 29));
		std.add(new Student("1517", "930622-2256789", "김미자", 32));
		
		pro.add(new Professor("1718", "940822-1597514", "김길동", 154));
		pro.add(new Professor("1719", "960822-2597514", "황미자", 264));
		
		dep.add(new Department(1541, "김홍도", "삼성"));
		dep.add(new Department(1544, "홍기자", "현대"));
		
		take.add(new Takes("1718", "김홍도", "344"));
		take.add(new Takes("1719", "홍기자", "344"));
	}
}

