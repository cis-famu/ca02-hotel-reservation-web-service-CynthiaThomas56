/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.B2BHotelService.endpoint;

import com.mycompany.B2BHotelService.model.PO;
import com.mycompany.B2BHotelService.model.Room;
import com.mycompany.B2BHotelService.service.POService;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author cynth
 */

@WebService
public class reserveRoom {
    
    private final POService service = new POService();
    
    
    @WebMethod(operationName= "allPos")
    @WebResult(name= "reserveRoom")
    public ArrayList<Room> getAllreserveRoom(){
        return service.all();
    }       
   
    /**
     *
     * @param ConfirmationNo
     * @return
     */
    @WebResult(name="reserveRoom")
    public Room getreserveRoomByConfirmationNo(@WebParam(name = "reserveRoomId")int ConfirmationNo){
        return service.findByConfirmationNo(ConfirmationNo);
    } 

    /**
     *
     * @param submitted
     * @return
     */
    @WebResult(name="reserveRoom")
    public ArrayList<PO> getBySubmittedDate(@WebParam(name = "submitted") Date submitted){
        return PO.findBySubmittedDate(submitted);    
 }
}