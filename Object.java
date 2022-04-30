import java.util.Objects;

public class Object {
	
	private String nome;
	private int numero;

	public Object(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}
	
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		Object other = (Object) objeto;
		return Objects.equals(nome, other.nome) && numero == other.numero;
	}
	
}
