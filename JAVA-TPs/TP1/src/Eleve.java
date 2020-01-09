package javaproject.TP1.src.GestionEleves;

import java.util.ArrayList;
import java.util.Scanner;


public  class Eleve implements Comparable<Eleve> {

	String nom ;
	ArrayList <Integer> list = new ArrayList <Integer>();
	double moyenne ;
	

	public Eleve(String nom) 
	{
	
		this.nom = nom ;			
	}

	public double getMoyenne() 
	{
            double nb= (double ) this.getListNotes().size() ;
            int somme =0 ;
        for(int i=0 ; i<nb ; i++){
        somme += this.getListNotes().get(i) ;
        
        }
 		return (double)somme / nb ;
	}

	public void ajouterNote(int note)
	{
            this.list.add(note);
		
		
	}

	public String getNom() 
	{
		return nom;
	}
	public  ArrayList<Integer> getListNotes()
	{
		
		return this.list ;
		 
	}
	public String toString()
	{
		return "le nom  " + nom + " les notes :  " + this.getListNotes() + " la moyenne : " + this.getMoyenne();
	}
	
     @Override
    public int compareTo(Eleve t) {
       
         if(this.getMoyenne() > t.getMoyenne() ) return 1 ;
         if( this.getMoyenne() < t.getMoyenne() ) return -1 ;//To change body of generated methods, choose Tools | Templates.
  
         return 0  ; }
  
    
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Eleve eleve1 = new Eleve("Ishak");
		Eleve eleve2 = new Eleve("Marouane") ; 
                Eleve eleve3= new Eleve("Simo");
		eleve2.ajouterNote(10);
		eleve2.ajouterNote(12);
                eleve2.ajouterNote(15);
                eleve3.ajouterNote(13);
                eleve3.ajouterNote(4);
                eleve3.ajouterNote(11);
                //eleve1.ajouterNote(3);
           GroupesEleves grp=new GroupesEleves();
                
         //       eleve3.compareTo(eleve2);
		
		/* int i=1 ;
		int compt=1 ;
		while (i!=0) {
			int nb ; 
			System.out.println("entrer la note "+compt+": ") ;
			nb= sc.nextInt() ;
			eleve1.ajouterNote(nb);
			System.out.print("si vous voulez entrer la note saisiser nombre different de 0: ");
		i= sc.nextInt() ;
		compt ++ ;
		}
		
		moyenne= 0 ;
	    for(int index=0 ; index < list.size() ; index++) {
			moyenne += list.get(index) ;
		    moyenne= (double)moyenne/(index+1) ;
			
		}
	*/	
		System.out.println(eleve3.toString());
                System.out.println(eleve2.toString());
             //   System.out.println("Qui est mieux : " +eleve2.compareTo(eleve3));
	        System.out.println(" "+grp.meilleurEleve());
        }  

  
	
}
