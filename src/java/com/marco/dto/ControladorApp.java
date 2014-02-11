/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marco.dto;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author MARCO
 */
public class ControladorApp {
    
    Session session=null;
    
    public ControladorApp(){
    this.session=HibernateUtil.getSessionFactory().getCurrentSession();
        
    }
     public List getAllPerson(){
    
    List<Person> personList=null;
    
    try {
        
        org.hibernate.Transaction tx= session.beginTransaction();
        Query q= session.createQuery("FROM Person as person");
        personList=(List<Person>) q.list();
        
    } catch (Exception e)
            {
                e.printStackTrace();
                
            }
       
    
    return personList;
    
    }
    
}
