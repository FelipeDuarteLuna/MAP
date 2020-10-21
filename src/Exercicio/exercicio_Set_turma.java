package Exercicio;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class exercicio_Set_turma {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many students for course A ?");
		int n = sc.nextInt();
		
		for (int i = 0; i <n ; i++) {
			int matricula = sc.nextInt();
			a.add(matricula);
		}
		
		System.out.println("How many students for course B ?");
		n = sc.nextInt();
		
		for (int i = 0; i <n ; i++) {
			int matricula = sc.nextInt();
			b.add(matricula);
		}
		
		System.out.println("How many students for course C ?");
		n = sc.nextInt();
		
		for (int i = 0; i <n ; i++) {
			int matricula = sc.nextInt();
			c.add(matricula);
		}
		
		Set<Integer> totalStudents = new HashSet<>(a);
		System.out.println(totalStudents.size());
		totalStudents.addAll(b);
		totalStudents.addAll(c);
		System.out.println("Total students: " + totalStudents.size());
	}
}
