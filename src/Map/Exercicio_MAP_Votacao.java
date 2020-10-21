package Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class Exercicio_MAP_Votacao {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> eleicao = new HashMap<>();

		System.out.println("Enter file full path: ");
		String path = sc.nextLine(); // C:\\temp\\votacao.txt
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String [] fields = line.split(",");
				String candidatoName = fields[0];
				Integer numeroVoto = Integer.parseInt(fields[1]);
				
				//Candidato p = new Candidato(candidatoName, numeroVoto);
				if (eleicao.containsKey(candidatoName)) {
					System.out.println("Já tem esse candidato: " + candidatoName +" , Nº " + numeroVoto);
					int votesSoFar = eleicao.get(candidatoName);
					eleicao.put(candidatoName, numeroVoto + votesSoFar);
				}else {
					System.out.println("Name: " + candidatoName +" , Nº " + numeroVoto);
					eleicao.put(candidatoName, numeroVoto);
				}
					
				line = br.readLine();				
			}
			
			for (String key : eleicao.keySet()) {
				System.out.println(key + ": " + eleicao.get(key) );
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());

		}finally {
			sc.close();
		}
				
				
	}
}
