/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.examen_carranza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Persistencia {

    /**
     * @param args the command line arguments
     */
  
        
        public static void main(String[] args)throws Exception {
    
    
      SessionFactory factory=  Hibernateapoyo.getSessionFactory();
      
      
      
      Session sesion= factory.openSession();
      
     
      
      Transaction tranza=sesion.beginTransaction();
      
     
      Evaluacion ev=new Evaluacion();
      ev.setNombre("Ana");
      sesion.save(ev);
      tranza.commit();
      sesion.close();
    
      
      
    
        }
}
