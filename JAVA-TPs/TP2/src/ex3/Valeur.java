package ex3;

public class Valeur {
	
	int valeur ; 
	
	Valeur(int valeur){
		
		this.valeur= valeur ; 
		
	}
	
	int getVal() {
		return this.valeur;
	};
	 void add(int i) {
		 this.valeur= i ;
	 }; 
	
	 public String toString() {
		 
		 return "La valeur est : "+ this.valeur+"" ;
	 };

	 
	 
	 
	 
	 
	 
	 
}
