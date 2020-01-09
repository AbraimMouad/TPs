package ex1;
import java.util.* ; 
import java.lang.*;
 class Compter implements Runnable {

//	
//	
	int compter ;
	int decompter ;
		Compter(int compt , int decompt){
			compter= compt ;
			decompter= decompt ;
		}
//	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	while(compter < 1000) {
		
		compter++ ;

		System.out.println(" compter "+ compter) ;
		
	
	}
	while (decompter > 0) {
		decompter -- ; 
		System.out.println(" decompter "+ decompter) ;
	}
	

	}
	

	
	public static void main(String[] args)
	{
		
		Runnable t1= new Compter(0,-1);
		Runnable t2= new Compter(1001,1000);
		
		new Thread(t1).start();
		new Thread(t2).start();
	}
	
	
	
	
	
	
	
	
}
