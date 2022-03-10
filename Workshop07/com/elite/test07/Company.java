package com.elite.test07;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 넣는다.
		// HashMap에 넣을 때 키 값은 각 객체의 Number로 한다.
		map.put(1, new Secretary("Hilery", 1, "secretary", 800));
		map.put(2, new Sales("Clinten", 2 ,"sales", 1200));
		// 모든 객체의 기본 정보를 출력한다(for문을 이용하여 출력한다.)
		System.out.println("name\tdepartment\tsalary");
		System.out.println("------------------------------------------");
		for (int i = 1; i <= 2; i++) {
			System.out.println(map.get(i).getName() + "\t" 
							  + map.get(i).getDepartment() + "   \t" 
							  + map.get(i).getSalary());
		}
		// 모든 객체에 인센티브 100씩 지급한다.
		((Bonus)map.get(1)).incebtive(100);
		((Bonus)map.get(2)).incebtive(100);
		
		System.out.println("\n인센티브 100지급");
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------------------");
		// 모든 객체의 정보와 세금을 출력한다 (for문을 이용하여 출력한다.)
		for (int i = 1; i <= 2; i++) {
			System.out.println(map.get(i).getName() + "\t" 
							  + map.get(i).getDepartment() + "   \t" 
							  + map.get(i).getSalary() + "\t"
							  + map.get(i).tax());
		}
	}

}
