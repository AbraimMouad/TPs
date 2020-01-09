package ex2;

public class TestOrder extends Thread{

	Compteur com ;
	TestOrder(Compteur Co){
		
	com = Co ;
		
	}
	
	
	public void run() {
	
		try {
		int nombre=1 ; 
		com.start();
		
		while (nombre > 0) {
			
		//com.start();
	
		nombre++ ; 
		sleep(100);
		}
		}catch(InterruptedException e){
			return ; 
			
		}
		
		
	}
	
	
	public static void main(String[] args ) {
		
		TestOrder test1= new TestOrder(new Compteur("ishak",10));
		TestOrder test2= new TestOrder(new Compteur("Marouane",15));
		
		
		test1.start();
		test2.start();
		
	}
	
	
	
}
