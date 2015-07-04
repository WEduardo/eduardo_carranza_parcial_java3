/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.examen_carranza;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class DAOEvaluacion {
    
static SessionFactory factory;
static Session session;
static Transaction tranza;   

    
    public static void abrirSesion(){
    //inician la sesion
    factory=Hibernateapoyo.getSessionFactory();
    session=factory.openSession();
    tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
    tranza.commit();
    session.close();
}




    public DAOEvaluacion(){
        
    }
    
      public void guardar(Evaluacion e) throws Exception {
        //Aquí va el código del INSERT, después invocas al método cerrarTodo
        abrirSesion();
        session.save(e);
        cerrarTodo();
    }
}
