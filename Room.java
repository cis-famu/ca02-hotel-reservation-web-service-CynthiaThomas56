package com.mycompany.B2BHotelService.model;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Cynthia Thomas
 */

/*Class Rooms*/

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)


public class Room {
    private final @XmlAttribute int roomNum;
    private @XmlAttribute int stayDays;
    private final String bedType;
    private String personName;
    
    

/*Constructor*/   
public Room(int roomNum, String bedType){
       
    this.roomNum = roomNum;
        
    if (bedType.equalsIgnoreCase("Single")){this.bedType = bedType;}
    else if(bedType.equalsIgnoreCase("Suite")) {this.bedType = bedType;}
    else{this.bedType = "Queen";}
    
    stayDays = 0;
    personName = null;
}

    public Room(int i, String king, Date date, hotelChoice name, String items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Room(int i, String king, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Room(int i, String single, Date date, hotelChoice name, ArrayList<Room> rooms) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
public int getRoomNum(){
    return roomNum;
}

public String getBedType(){
    return bedType;
}
 
public int getstayDays(){
    return stayDays;
} 

public String getpersonName(){
    return personName;
} 

public boolean setpersonName (String guest, int daysToStay){
    if (getstayDays()== 0){
        personName = guest;
        stayDays = daysToStay;
        return true;
    }
    return false;
}


    public void priorDays(){
       if (getstayDays()>0){
           stayDays = stayDays -1;
       } 
       else{ 
        stayDays = 0;
        personName = null;
       }
       
    }        

    public Object getSubmitted() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }
    
    
    
    

    
   

   
   
