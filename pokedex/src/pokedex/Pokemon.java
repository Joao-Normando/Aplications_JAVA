package pokedex;

public class Pokemon {
	private String nome;
	private String tipo;
	private Data diaCaptura;
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	private  Data diaCaputra;
	
	public Data getDiaCaputra() {
		return diaCaputra;
	}
	public Pokemon(String nome, String tipo, Data diaCaptura) {
		this.nome = nome;
		this.tipo = tipo;
		this.diaCaputra = diaCaptura;
	
	}
	@Override
	public String toString() {
		return nome;
		
		
	}
	public Data getDiaCaptura() {
		return diaCaptura;
	}

}
