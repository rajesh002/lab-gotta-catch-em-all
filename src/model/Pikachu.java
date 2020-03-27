package model;

/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
public class Pikachu extends Pokemon{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	public Pikachu(String pokemonName, int pokemonNumber,String characteristics,String type,String evolution,String baseExp) {
		super(pokemonName, pokemonNumber);
		this.characteristics=characteristics;
		this.type=type;
		this.evolution=evolution;
		this.baseExp=baseExp;
	}
	
	public String getCharacteristics() {
		return this.characteristics;
	}
	public String getType() {
		return this.type;
	}
	public String getEvolution() {
		return this.evolution;
	}
	public String getBaseExp() {
		return this.baseExp;
	}
	
}