/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import src.entities.Accounts;

/**
 *
 * @author MTimos
 */
public class AccountsDB {
    
     public static Accounts getAccountByID(Integer id){
        
        EntityManager em= DBUtil.getEmf().createEntityManager();
        
        try{
            Accounts a = em.find(Accounts.class, id);
             return a;
        }
        finally{
            em.close();
        }  
    } 
     
     public static List<Accounts> getAllAccounts(){
    
        EntityManager em = DBUtil.getEmf().createEntityManager();
        String q = "SELECT a FROM Accounts a";
        TypedQuery<Accounts> tq = em.createQuery(q, Accounts.class);
        
        List<Accounts> list;
        
        try{
            list = tq.getResultList();
            if(list == null || list.isEmpty())
                list = null;
        }
        finally {
            em.close();
        }      
        return list;
    }
     
     public static void insertAccount( Accounts a){
         
         EntityManager em = DBUtil.getEmf().createEntityManager();
         
         EntityTransaction trans = em.getTransaction();
         
         try{
            trans.begin();
            em.persist(a);
            trans.commit();
         }
         catch(Exception ex)
         {
             System.out.println(ex);
         }
         finally{
             em.close();
         }
         
     }
     
     public static void updateAccount( Accounts a){
         
         EntityManager em = DBUtil.getEmf().createEntityManager();
         
         EntityTransaction trans = em.getTransaction();
               
         try{
            trans.begin();
            em.merge(a);
            trans.commit();
         }
         catch(Exception ex)
         {
             System.out.println(ex);
         }
         finally{
             em.close();
         }
         
     }
     
     public static void deleteAccount(Accounts a){
         
         EntityManager em = DBUtil.getEmf().createEntityManager();
         
         EntityTransaction trans = em.getTransaction();
         
         try{
            trans.begin();
            em.remove(em.merge(a));
            trans.commit();
         }
         catch(Exception ex)
         {
             System.out.println(ex);
         }
         finally{
             em.close();
         }
     }
     
     public static int deleteAllAccountByLastName(String lastName){
         
         int count = 0;
         EntityManager em = DBUtil.getEmf().createEntityManager();
         EntityTransaction trans = em.getTransaction();
         
         TypedQuery<Accounts> tq = em.createNamedQuery("Accounts.deleteByName", Accounts.class);
         tq.setParameter("lastName", lastName);
         
         try{
            trans.begin();
            count = tq.executeUpdate();
            trans.commit();
         }
         catch(Exception ex)
         {
             System.out.println(ex);
             trans.rollback();
         }
         finally{
             em.close();
         }
         return count;
     }
    
}
