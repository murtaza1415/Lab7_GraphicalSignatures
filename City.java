package com.mycompany.graphicalsignatures.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author MuhammadMurtaza
 */

@Entity
public class City {
    @Id
    public int id;
    public String country;
    public double latitude;
    public double longitude;
    
    public void print() {
        System.out.println(country);
    }
    public int getId() {return id;}
    public String getCountry() {return country;}
    public double getLongitude() {return longitude;}
    public double getLatitude() {return latitude;}
    public void setId(int id) {
	this.id = id;
    }
    public void setCountry(String country) {
	this.country = country;
    }
    public void setLongitude(double longitude) {
	this.longitude = longitude;
    }
    public void setLatitude(double latitude) {
	this.latitude = latitude;
    }
}


