package pokedex;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
	
	protected List <Pokemon> pokemons;
	
	public Pokedex() {
		pokemons = new ArrayList<>();
			
		
	}
	public void adicionarPOkemon (Pokemon pokemon) {
		
		pokemons.add(pokemon);
		
	}
	public void adicionarPokemon(String nome, String tipo, Data diaCaputra ) {
		Pokemon pokemon = new Pokemon ( nome, tipo , diaCaputra);
		pokemons.add(pokemon);
	}
	
	public int getQuantidadePokemons() {
		return pokemons.size();
		
	}
	
	public int getQuantidadePokemons(Tipo tipo) {
		int contador = 0;
		for (Pokemon a: pokemons) {
			if(a.getTipo().equals(tipo)) {
			contador ++;	
			
			}
			
		}
		return contador;
	}
	public List<Pokemon> getPokemonsCaputurados(Data dia) {
		
		List<Pokemon> capturados = new ArrayList<>();
		boolean encontrei = false;
		for(Pokemon a: pokemons) {
			if (a.getDiaCaptura().getDia() == dia.getDia() && a.getDiaCaptura().getMes() == 
					dia.getMes() &&
					a.getDiaCaptura().getAno() == dia.getAno()) {
				capturados.add(a);
				encontrei = true;
			}
		}
		if (!encontrei)
			return null;
		else
			return capturados;
	}
	

		
}