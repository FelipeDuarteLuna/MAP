package Genericos_delimitados;

public class Product implements Comparable<Product> {
	
	private String name;
	private Double price;
	
	//Construtor
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	//Getter's and Setter's
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Method
	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + String.format("%.2f", this.getPrice())+ " ]";
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
	

	
	
}
