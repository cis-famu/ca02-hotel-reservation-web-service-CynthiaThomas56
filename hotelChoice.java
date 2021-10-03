/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.B2BHotelService.model;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author cynthia thomas
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

//create class for selecting location//
public class hotelChoice{
        private String name;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postalcode;
        private String phone;


//constructor to give the variable a value to pass through //
    public hotelChoice(String name, String street1, String street2, String city, String state, String postalcode, String phone){
     this.name = name;
     this.street1 = street1;
     this.street2 = street2;
     this.city = city;
     this.state = state;
     this.postalcode = postalcode;
     this.phone = phone;
        
    }

           
    public void setName(String name) {this.name = name;}
    public void setStreet1(String street1) {this.street1 = street1;}
    public void setStreet2(String street2) {this.street2 = street2;}
    public void setCity(String city) {this.city = city;}
    public void setState(String state) {this.state = state;}
    public void setPostalcode(String postalcode) {this.postalcode = postalcode;}
    public void setPhone(String phone) {this.phone = phone;}
    
    public String getName() {return name;}
    public String getStreet1() {return street1;}
    public String getStreet2() {return street2;}
    public String getCity() {return city;}
    public String getState() {return state;}
    public String getPostalcode() {return postalcode;}
    public String getPhone() {return phone;}

}    
