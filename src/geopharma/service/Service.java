
package geopharma.service;

import geopharma.Repository.Hibernate;
import geopharma.entity.Pharmacie;
import geopharma.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class Service {
    
    public void Ajouter_User(String nom, String prenom, String email, String pwd, String datnaiss, String fichier_preuve,Boolean isAdmin){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        
        try{
            User newUser = new User(nom,prenom,email,pwd,datnaiss,fichier_preuve,isAdmin);
            tr = session.beginTransaction();
            session.save(newUser);
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
        
    }
    
    public void Ajouter_Pharmacie(String nom,Double longd,Double lat,int contact,String ho, String hf,String jo,String mode, String email){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        User user = new User();
        try{
            String hql = "FROM User U WHERE U.email = :email";
            Query query = session.createQuery(hql);
            query.setParameter("email", email);
            List<User> results = query.list();
            if(results.isEmpty()){
                System.out.println("no existe");
            }else{
                user = results.set(0, user);
            }
            Pharmacie newPharmacie = new Pharmacie(nom,longd,lat,contact,ho,hf,jo,mode,user);
            tr = session.beginTransaction();
            session.save(newPharmacie);
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
    }
    
    public void connexion(String nom, String pwd){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        try{
         
            tr = session.beginTransaction();
            String hql = "FROM User U WHERE U.nom = :nom and U.password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("nom", nom);
            query.setParameter("password", pwd);
            List results = query.list();
            if(results.isEmpty()){
                System.out.println("no existe");
            }else{
                System.out.println("existe");
            }
            for(Object o : results){
                System.out.println(o);
            }
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
    }
    
    public Pharmacie searchPharmacie(String nom){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        Pharmacie pharmacie = new Pharmacie();
        try{
         
            tr = session.beginTransaction();
            String hql = "FROM Pharmacie P WHERE P.nom = :nom";
            Query query = session.createQuery(hql);
            query.setParameter("nom", nom);
            List<Pharmacie> results = query.list();
            if(results.isEmpty()){
                System.out.println("no existe");
            }else{
                pharmacie = results.set(0, pharmacie);
                System.out.println(pharmacie.getNom());
            }
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
            return null;
        }finally{
            session.close();
        }
        return pharmacie;
    }
    
    public List<Pharmacie> findAllPharmacie(){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        Pharmacie pharmacie = new Pharmacie();
        List<Pharmacie> results = null;
        try{
         
            tr = session.beginTransaction();
            String hql = "FROM Pharmacie P";
            Query query = session.createQuery(hql);
            results = query.list();
            if(results.isEmpty()){
                System.out.println("no existe");
            }else{
                pharmacie = results.set(0, pharmacie);
                System.out.println(pharmacie.getNom());
            }
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
            return null;
        }finally{
            session.close();
        }
        return results;
    }
    
    public User searchUser(String email){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        User user = new User();
        try{
         
            tr = session.beginTransaction();
            String hql = "FROM User U WHERE U.email = :email";
            Query query = session.createQuery(hql);
            query.setParameter("email", email);
            List<User> results = query.list();
            if(results.isEmpty()){
                System.out.println("no existe");
            }else{
                user = results.set(0, user);
                System.out.println(user.getNom());
            }
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
            return null;
        }finally{
            session.close();
        }
        return user;
    }
    
    public void deleteUser(int id){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        try{
            tr = session.beginTransaction();
            String hql = "DELETE FROM User U WHERE iduser = :iduser";
            Query query = session.createQuery(hql);
            query.setParameter("iduser", id);
            int result = query.executeUpdate();
            System.out.println("Ligne affectée: " + result);
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
    }
     
    public void deletePharmacie(int id){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        try{
            tr = session.beginTransaction();
            String hql = "DELETE FROM Pharmacie P WHERE idpharmacie = :idpharmacie";
            Query query = session.createQuery(hql);
            query.setParameter("idpharmacie", id);
            int result = query.executeUpdate();
            System.out.println("nombre de Ligne affectée: " + result);
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
    }
    
    public void modifier_pharmacie(int id, String setValeur){
        Session session = Hibernate.getSessionFactory().openSession();
        Transaction tr = null;
        try{
            tr = session.beginTransaction();
            String hql = "UPDATE Employee set nom = :nom WHERE iduser = :id";
            Query query = session.createQuery(hql);
            query.setParameter("nom", setValeur);
            query.setParameter("iduser", id);
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            tr.commit();
        }catch(Exception e){
            tr.rollback();
            System.out.println("transaction non termainée : "+e.getMessage());
        }finally{
            session.close();
        }
    }
    
    public void modifier_user(){
        
    }
    
    public static void LocaliserpPharmacie(){
        
    }
}
