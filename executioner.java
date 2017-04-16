/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executioner;


import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.graphicalsignatures.DAO.CityDao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.mycompany.graphicalsignatures.model.City;
import org.hibernate.Transaction;
/**
 *
 * @author MuhammadMurtaza
 */
public class executioner {
    public static void main(String[] args) {
		ArrayList<City> cityList = new ArrayList<City>();
                CityDao cityDao = new CityDao();
                
                String csvFile = "E:\\University\\Semester 6\\Software Construction\\Labs\\Lab 5\\GeoLiteCity-Location.csv";
                String line;
                String commaSeparater = ",";

		        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] country = line.split(commaSeparater);
                int id = Integer.parseInt(country[0]);
                double latitude = Double.parseDouble(country[5]);
                double longitude = Double.parseDouble(country[6]);
                
            
                City e1=new City();  
                e1.setId(id);  
                e1.setCountry(country[1]);  
                e1.setLongitude(longitude);
                e1.setLatitude(latitude);
                cityList.add(e1);
		
                /**System.out.println(country[0]);
                System.out.print(country[1]);
                System.out.println(country[2]);
                System.out.println(country[3]);
                System.out.println(country[4]);
                System.out.println(country[5]);
                System.out.println(country[6]);
                **/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
		try{
			cityDao.save(cityList);
		}finally{
			cityDao.finalize();
		}
	}
}
