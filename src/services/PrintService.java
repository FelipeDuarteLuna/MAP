package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<fdl> {
	
	List<fdl> list = new ArrayList<>();

	//Construtor
	public PrintService(){
		
	}
	
	public void addValue(fdl value) {
		list.add(value);
	}
	
	public fdl first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lisit is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		for (int i = 1; i < list.size(); i++) {
			System.out.print(" ," + list.get(i));
		}
		System.out.println("]");
	}
}
