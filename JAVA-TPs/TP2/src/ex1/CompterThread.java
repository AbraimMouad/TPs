package ex1;

import java.util.*;

public class CompterThread extends Thread{


	


	int compter ;
	int decompter ;
		CompterThread(int compt , int decompt){
			compter= compt ;
			decompter= decompt ;
		}
	
		
		
		public void run () {
			
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
			
			CompterThread t1= new CompterThread(0,-1);
			CompterThread t2= new CompterThread(1001,1000);
			t1.start();
			t2.start();
		}
		
}

