package ex3;
import java.math.*; 
public class Ajob implements Runnable {

	Valeur v ; 
	int indice ; 
	Ajob(Valeur myval,int i ){
		
		this.v= myval ;
	indice = i ;
		
	}
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	int vl=0 ;
double nb = Math.pow(10,6) ; 
	while( (double) indice < nb) {
			
			this.v.add(indice);
			System.out.println(this.v.toString());	
			(indice)++ ;
			}

	}
	
	

	
	public static void   main(String[] args ) {
	Runnable ajob = new Ajob(new Valeur(5),2);
	
		new Thread(ajob).start();
	}
	
	
}
