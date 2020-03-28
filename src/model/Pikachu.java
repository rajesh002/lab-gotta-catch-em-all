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
 * characteristics = "Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
public class Pikachu extends Pokemon{
	String characteristics="Pikachu is an Electric-type Pok�mon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pok�mon franchise mascot.";
	String type="ELECTRIC";
	String evolution="  RAICHU";
	String baseExp="112";
	public Pikachu(String pokemonName, int pokemonNumber) {
		super.pokemonName="Pikachu";
		super.pokemonNumber=25;
	}
	
	public String characteristics() {
		return this.characteristics;
	}
	public String type() {
		return this.type;
	}
	public String evolution() {
		return this.evolution;
	}
	public String baseExp() {
		return this.baseExp;
	}
	
}