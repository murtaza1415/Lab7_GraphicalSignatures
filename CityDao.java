package com.mycompany.graphicalsignatures.DAO;

import java.util.ArrayList;
import com.mycompany.graphicalsignatures.model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mycompany.graphicalsignatures.util.HibernateUtil;

/**
 *
 * @author MuhammadMurtaza
 */
public class CityDao {
    public Session currSession = null;
	public CityDao(){
		HibernateUtil.createSessionFactory();
		currSession=HibernateUtil.getSessionFactory().openSession();  
	}
	public void finalize(){
		currSession.close();
	}
        public void save(ArrayList<City> newEmpList){
		Transaction t=currSession.beginTransaction();  
      		for(int i=0;i<newEmpList.size();i++){
			currSession.persist((City)newEmpList.get(i));
		}
      		t.commit(); 
        }

}
