/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.B2BHotelService.model;

/**
 *
 * @author cynth
 */
import java.util.ArrayList;
import java.util.Calendar;
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
public class PO {

    public static ArrayList<PO> findBySubmittedDate(Date submitted) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String fName;
    private String lName;
    private int CustomerId;/*system generated*/
    private int ConfirmationNo;/*system generated*/
    private Calendar submitted;/*system generated*/
    private String paymentStatus;/*boolean*/
    private String platform;

    public PO(String fName, String lName, int CustomerId, int ConfirmationNo, Calendar submitted, String paymentStatus, String platform) {
        this.fName = fName;
        this.lName = lName;
        this.CustomerId = CustomerId;
        this.ConfirmationNo = ConfirmationNo;
        this.submitted = submitted;
        this.paymentStatus = paymentStatus;
        this.platform = platform;
    }

  
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getConfirmationNo() {
        return ConfirmationNo;
    }

    public void setConfirmationNo(int ConfirmationNo) {
        this.ConfirmationNo = ConfirmationNo;
    }

    public Calendar getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Calendar submitted) {
        this.submitted = submitted;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
    
    
    

    