package ex3;

public class Test implements Runnable  {
	
	
	Valeur myval ;
	
	Test(Valeur myval){
		
		this.myval = myval ;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	Ajob ajob1= new Ajob(this.myval,1);
		Ajob ajob2= new Ajob(this.myval,-1);
	new Thread(ajob1).start();
		new Thread(ajob2).start();
		//System.out.println("   "+this.myval);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	Runnable Test1= new Test(new Valeur(5));
		
		new Thread(Test1).start();
		
		// la valeur afficher c est 5 
	
	}
	
	
	
	

}
