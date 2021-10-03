package com.mycompany.B2BHotelService.model;


import java.util.Calendar;

/*
 *
 * @author cynthia thomas
 */
public class ReservationsItem {
    private String fName;
    private String lName;
    private int CustomerId;/*system generated*/
    private int ConfirmationNo;/*system generated*/
    private Calendar submitted;/*system generated*/
    private String paymentStatus;/*boolean*/
    private String platform;

    public ReservationsItem(String fName, String lName, int CustomerId, int ConfirmNum, Calendar submitted, String paymentStatus, String platform) {
        this.fName = fName;
        this.lName = lName;
        this.CustomerId = CustomerId;
        this.ConfirmationNo = ConfirmationNo; /*system generated*/
        this.submitted = submitted;
        this.paymentStatus = paymentStatus;
        this.platform = platform;
    }

    public void setfName(String fName) {this.fName = fName;}
    public void setlName(String lName) {this.lName = lName;}
    public void setCustomerId(int CustomerId) {this.CustomerId = CustomerId;}
    public void setConfirmationNo(int ConfirmationNo) {this.ConfirmationNo = ConfirmationNo;}
    public void setSubmitted(Calendar submitted) {this.submitted = submitted;}
    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}
    public void setPlatform(String platform) {this.platform = platform;}

    
    public String getfName() {return fName;}
    public String getlName() {return lName;}
    public int getCustomerId() {return CustomerId;}
    public int getConfirmNum() {return ConfirmationNo;}
    public Calendar getSubmitted() {return submitted;}
    public String getPaymentStatus() {return paymentStatus;}
    public String getPlatform() {return platform;}

   
    }

    
    
