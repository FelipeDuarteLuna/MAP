package entities;

public class Candidato {

	private String Name;
	private Integer voto;
	
	//Construtor
	public Candidato() {
		
	}
	
	public Candidato(String nome, Integer voto) {
		this.Name = nome;
		this.voto = voto;
	}

	//Getterts and Setter's
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getVoto() {
		return voto;
	}

	public void somartVoto(Integer voto) {
		this.voto += voto;
	}

	//Method's
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
	


	
}
