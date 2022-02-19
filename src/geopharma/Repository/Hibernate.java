
package geopharma.Repository;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Hibernate {
    
    public static SessionFactory sessionFactory;
    
    static{
        try{
            Configuration conf = new Configuration();
            conf.addAnnotatedClass(geopharma.entity.User.class);
            conf.addAnnotatedClass(geopharma.entity.Pharmacie.class);
            conf.configure();
            ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
            sessionFactory = conf.buildSessionFactory(serviceReg);
        }catch(Exception e){
            System.out.println("initialisation de la session echoué : "+e.getMessage());
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
