/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.TP1.src.GestionEleves;
import java.util.* ;
import java.io.* ;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author Marouane
 */
public class FileStatistics {
     File f , fo ;
    
    public  FileStatistics(String filename){
        this.f= new File(filename);
    }
    
    FileReader fr ;
    FileInputStream fis= null ;
    FileOutputStream fos ;
     //byte[] buf=new byte[8];
  String ligne ;
  DataInputStream dis ;
    
    
    
 public void getCharCount() throws IOException, FileNotFoundException{
      fis= new FileInputStream(f);
      dis=new DataInputStream(new BufferedInputStream(fis));
      
     
   // String str= dis.readLine() ;
   int n= 0 ;
    int compter=0 ;
      
     char ab=' ';
      byte[] buf = new byte[8];
     String str=" ";
     while ((n=fis.read(buf)) >= 0){
         for(int i=0 ; i<n ; i++){
           str += (char)buf[i];  
         }
         
     }

   
     for (int index=0 ; index < str.length() ;index++){
         if (str.charAt(index)!=ab) {
             compter++ ;
         }
         
     }
      
 
   //    System.out.println(" Le nombre de caractère:  "+compter); 
      
     System.out.println("Nombre des caractère "+compter);
 } ;
 
 
 
 
 
    public void getWordCount() throws IOException, FileNotFoundException{ 
        fis= new FileInputStream(f);
      dis=new DataInputStream(new BufferedInputStream(fis));
      
 //      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new InputStreamReader(f))) ;
      
   // String str= dis.readLine() ;
    int compter=-1 ;
      int n=0 ; 
     char ab=' ';
      byte[] buf = new byte[8];
     String str=" ";
     while ((n=fis.read(buf)) >= 0){
         for(int i=0 ; i<n ; i++){
           str += (char)buf[i];  
         }
         
     }
     
     String[] tabS= str.split("\\s+");
     for(String a: tabS){
         
       
         compter++ ;
     }
     
     /*
     for (int index=0 ; index < str.length() ;index++){
   //  String[] tab= str.split(" ");
     
        if(index!=0){
        if (str.charAt(index)==ab &&  str.charAt(index-1)!=ab ) {
             compter++ ;
         }
        }else{
            if (str.charAt(index)==ab) {
             compter++ ;
         }
        }
         compter++ ;
     } */
   
  //    System.out.println(" Le nombre de caractère:  "+compter); 
      
     System.out.println("le nombre des mots:  "+compter);
    } ;
    
    
    
    
    
    
    public void getSentenceCount(){};
    public void getParagrapheCount()throws IOException, FileNotFoundException{fis= new FileInputStream(f);
      dis=new DataInputStream(new BufferedInputStream(fis));
      
   //  String str= dis.readLine() ;
    int compter=0 ;
      int n=0 ; 
    
       byte[] buf = new byte[8];
     String str=" ";
     while ((n=fis.read(buf)) >= 0){
         for(int i=0 ; i<n ; i++){
           str += (char)buf[i];  
         }
     for (int index=0 ; index < str.length() ;index++){
         if (str.charAt(index)=='.') {
             compter++ ;
         }
         
     }
      
 
   //    System.out.println(" Le nombre de caractère:  "+compter); 
      
     
    
    
    
    
    
    };
   System.out.println("nombre paragraphe "+compter); 
    }
     
    public void copy(String result)throws Exception{
       fos = new FileOutputStream(fo);
        for(int i=0; i< result.length() ;i++){
            fos.write((int)result.charAt(i));
        }
        
    }
    
    
    
    public static void main(String[] args) throws Exception, FileNotFoundException {
        
        FileStatistics f= new FileStatistics("C:\\Users\\DS\\Desktop\\Est\\Fichier.txt");
        f.getCharCount();
        f.getWordCount();
        f.getParagrapheCount();
   
        FileStatistics fo= new FileStatistics("C:\\Users\\DS\\Desktop\\Est\\frCopy.txt");
        
        fo.copy("salamdrari");
   
    }
    
    
    
    
}
