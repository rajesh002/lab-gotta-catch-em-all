package model;


//PROGRESSION - 2 
//Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 

public class Bulbasaur extends Pokemon{
	String characteristics="Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.";
	String type="POISON";
	String evolution="IVYSAUR";
	String baseExp="64" ;
	public Bulbasaur(String pokemonName, int pokemonNumber) {
		super.pokemonName=" Bulbasaur";
		super.pokemonNumber=001;
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

