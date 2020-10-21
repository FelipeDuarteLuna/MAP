package Exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class application_log {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String patch = sc.next(); // c:\\temp\\set1.txt
		
		try(BufferedReader br = new BufferedReader(new FileReader(patch))) {
			Set<User> logUser = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				String [] fields =  line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				logUser.add(new User(userName, moment));
				System.out.println(line);
				line = br.readLine();
			}
			System.out.println("Total users: " + logUser.size());
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}finally {
			sc.close();
		}
		
		
	}

}
