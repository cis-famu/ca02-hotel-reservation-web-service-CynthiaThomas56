/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.B2BHotelService.service;

import com.mycompany.B2BHotelService.model.hotelChoice;
import com.mycompany.B2BHotelService.model.Room;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author cynth
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class POService {
  private final ArrayList<Room> list = new ArrayList(); 
  
 
  public POService(){
      hotelChoice name = new hotelChoice("Helping", "N Jack Street", null, "Tallahassee", "FL", "33333", "850-414-9000");
     /*private String name;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postalcode;
        private String phone; */
      
      ArrayList<Room> rooms;
      rooms = new ArrayList<>();
      rooms.add(new Room(333,"King", 3));
      
      /*int roomNum, String bedType */
      list.add(new Room(123, "Single", new Date(System.currentTimeMillis()),name, rooms));
      list.add(new Room(223, "Suite" , new Date(System.currentTimeMillis()),name, rooms));
/*      list.add(new Room(344, 334, new Date(System.currentTimeMillis()), add1, add2, rooms));*/
  }
 /*return all rooms by customerID*/
  public ArrayList<Room> all(){
      return list;
  }
  public Room findByCustomerId(int CustomerId){
     for(int i = 0; i < list.size(); ++i)
     {
         if (list.get (i).getID() == CustomerId)
             return list.get(i);
     }
      return null;
  }

  
/*return all rooms by confirmation number*/
  

  public Room findByConfirmationNo(int ConfirmationNo){
     for(int i = 0; i < list.size(); ++i)
     {
         if (list.get (i).getID() == ConfirmationNo)
             return list.get(i);
     }
      return null;
  }  
/*return all rooms by checkin date*/
 public ArrayList<Room> findBySubmittedDate(Date submitted){
         ArrayList<Room> returnList = new ArrayList<>();
     for(int i = 0; i < list.size(); ++i)
     {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
         String objDate = formatter.format(list.get(i).getSubmitted());
         if (objDate.compareTo(formatter.format(submitted))==0)
             returnList.add(list.get(i));
     }
      return returnList;
  
}
}

 
