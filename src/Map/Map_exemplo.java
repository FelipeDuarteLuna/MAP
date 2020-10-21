package Map;

import java.util.Map;
import java.util.TreeMap;

public class Map_exemplo {
	public static void main(String[]args) {
		
		Map<String, String> cookies = new TreeMap<String, String>();
		
		cookies.put("username", "Maria"); // Adicionando valores a Coleção  Map
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println("Key " + ": " + cookies.get(key));
		}
		
		cookies.remove("email"); // Removendo a chave e respectivamente o conteudo da chave na coleção Map
		cookies.put("phone", "99711133"); // não permite repetição das chaves, ele sobrescrever o conteudo da chave.
		
		System.out.println();
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println("Key " + ": " + cookies.get(key));
		}
		
		System.out.println("Contains 'phone' ley : " + cookies.containsKey("phone"));
		System.out.println("Phone number º: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
	}

}
