package ex2;

public class Compteur extends Thread{
	
	String nom ;
	int MaxValue ;
	
	Compteur(String nom , int MaxValue){
		
		
		this.nom= nom ;
		this.MaxValue = MaxValue ;
		
	}
	
	public void run() {
		int compteur = 0 ;
	try {	
		while ( compteur < MaxValue) {
			System.out.println(" Le nom :   "+ this.nom);
			System.out.println("compteur :"+compteur);
			compteur ++ ;
		       sleep(100);
			
		}
		
	}catch(InterruptedException e ) {
		return ;
	}
		
		
	}
	
	public static void main(String[] args ) {
		
		Compteur comp1= new Compteur("ISHAK",10000);
		comp1.start();
		
		
		
		 
		
	}

}
