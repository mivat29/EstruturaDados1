
public class Vetor {
	private Object[] objetos = new Object[10];
	private int tamanho = 0;
	
	
	void inserir (Object objeto) {
		//verificar qual a posicao livre
		
		//percorrer a lista até encontrar uma posição livre
		for (int i=0; i < this.objetos.length; i++) {
			//a posicao está livre?
			if (this.objetos[i]==null) {
				this.objetos[i] = objeto;
				this.tamanho++;
				break;
			}
		}
		
	}
	
	void inserirPos(Object objeto, int posicao) {
		if (!this.posicaoValida(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}

		//desloca os elementos para a direita
		for (int i = this.tamanho-1 ; i >= posicao; i--) {
			this.objetos[i+1] = this.objetos[i];
		}

		this.objetos[posicao] = objeto;
		this.tamanho++;
		
	}

	private boolean posicaoValida(int posicao){
		return posicao >=0 && posicao <= this.tamanho;
	}
	
	Object obtem(int posicao) {
	
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.tamanho;
	}

	public void removerInt(int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = posicao ; i<this.tamanho-1; i++) {
			this.objetos[i] = this.objetos[i+1];
		}
		this.tamanho--;
	}

	public void remover(Object objeto) {
		int pos = this.busca(objeto);
		System.out.println("posicao:"+pos);
		if (pos >-1){
			this.removerInt(pos);
		}
		
	}

	public int busca (Object objeto){
		for(int i=0; i<this.tamanho;i++){
			if(this.objetos[i].equals(objeto)){
				return i;
			}
		}
		return -1;
	}

	void clear() {
		for (int i = 0; i <= this.tamanho ; i++) {
			this.objetos[i] = null;
		}

		this.tamanho=0;
	}
	
	public int indexOf(Object objeto) { 
		for (int i = 0;  i<this.tamanho; i++) {
			if(this.objetos[i].equals(objeto)){
				System.out.println("\nAchou!");
				return i;
				
			}
		} 
		return -1;
	}
	
	public int lastIndexOf(Object objeto) { 
		int ultPosicao=-1;
		for (int i = 0; i<this.tamanho; i++) {
			if(this.objetos[i].equals(objeto)){
				ultPosicao = i;
			}
		}
		
		return ultPosicao; 
	}

		
	boolean contem(Object objeto){
		for (int i = 0; i < objetos.length; i++) {
			if (objeto == this.objetos[i]) {
				return true;
			}
		}
		return false;
	}
	
	int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		if (this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder saida = new StringBuilder();
		
		saida.append("[");
		
		for (int p=0; p<this.tamanho-1; p++) {
			saida.append(this.objetos[p]);
			saida.append(", ");
		}
		
		saida.append(this.objetos[this.tamanho-1]);
		saida.append("]");
			
		return saida.toString();
	}
}
















