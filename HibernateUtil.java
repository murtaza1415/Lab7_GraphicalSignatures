package com.mycompany.graphicalsignatures.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.mycompany.graphicalsignatures.model.City;

/**
 *
 * @author MuhammadMurtaza
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    
    public static void createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure().addAnnotatedClass(com.mycompany.graphicalsignatures.model.City.class);
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    }
    public static SessionFactory getSessionFactory(){
            return sessionFactory;
    }

}

