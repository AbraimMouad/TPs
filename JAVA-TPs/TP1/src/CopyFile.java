/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.TP1.src.GestionEleves;
import java.io.* ;
import java.util.* ;
import java.io.File ;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream ;

/**
 *
 * @author Marouane
 */
public class CopyFile {
    
    public static void main(String[] args) {
        
        FileInputStream fis= null ;
        FileOutputStream fos= null ;
       
        
        
        try {
             File f = new File("C:\\Users\\DS\\Desktop\\Est\\Fichier.txt") ;
         
            fis= new FileInputStream(f);
        fos= new FileOutputStream(new File("C:\\Users\\DS\\Desktop\\Est\\frCopy.txt")) ;
            
            
            
        
        
        
            
            
            
            
            
            
            
     
        
        
        
    } catch (IOException e){
        
        e.printStackTrace();
    }  
        
    
    
    
    
    
    
}
}