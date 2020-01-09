/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.TP1.src.GestionEleves;

import java.util.ArrayList;
import java.util.* ;

/**
 *
 * @author Marouane
 */
public class GroupesEleves {
    ArrayList<Eleve> listesEleves= new ArrayList<Eleve>() ;
    
 
public int nombres(){
    
    // utilisation de iterator au lieu de lstesEleves.size() 
    
    /*   String objet ;
       int nbr=0 ;
       Iterator  it= listesEleves.iterator() ;
       
                 while(it.hasNext()){
                  objet = (String) it.next() ;
                  nbr++ ;
                 }
        */
  return  this.listesEleves.size() ;  };
 
    
 public ArrayList<Eleve>  getList(){
    
    /* List list = new ArrayList<Eleve>() ;
     String objet ;
 Iterator  it= listesEleves.iterator() ;
       
                 while(it.hasNext()){
                     objet = (String) it.next() ;
                     list.add(objet);
                 }*/
 return listesEleves ;} 
 
 public void AjouterEleve(Eleve eleve){
  
listesEleves.add(eleve);
     
 }
    
 public Eleve chercher(String nom){
     int a ;
     for(int i=0;i< listesEleves.size(); i++){
        
         if( listesEleves.get(i).equals(nom)) return listesEleves.get(i) ;
         
     }
      return null ; 
 }
 
 public void lister(){
     for(int i=0;i< listesEleves.size(); i++){
     System.out.println(" "+listesEleves.get(i));
     
     }
 }
 
 public Eleve meilleurEleve(){
     
    return  Collections.max(listesEleves);
 
 }
 
 public ArrayList<Eleve>  trierEleves(){
     
     Collections.sort(listesEleves);

 return listesEleves ;
 }
 
 
    
    
    
    public static void main(String[] args){
        GroupesEleves e= new GroupesEleves() ;
        Eleve e1 , e2 ,e3 , e4  ;
       /* e.listesEleves.add("ahmed");
        e.listesEleves.add("marouane");
        e.listesEleves.add("ishak");*/
       e1=new Eleve("reda") ;
       e2=new Eleve("marouane") ;
       e3=new Eleve("ishak") ;
   
                e2.ajouterNote(10);
		e2.ajouterNote(12);
                e2.ajouterNote(15);
                e3.ajouterNote(13);
                e3.ajouterNote(4);
                e3.ajouterNote(11);
                e1.ajouterNote(3);
                
           e.AjouterEleve(e2);     
           e.AjouterEleve(e1);    
           e.AjouterEleve(e3);
           e.lister();
           
           
       System.out.println("Le premier Etudiant:  "+e.meilleurEleve().nom);
       System.out.println("Classement croissant des etudiants:  "+e.trierEleves());
       // System.out.println("le nombre des étudiants : "+e.nombres()) ;
       
       
        
        
        
    }
    
    
}
