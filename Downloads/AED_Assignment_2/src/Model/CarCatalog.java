/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bhavana
 */
public class CarCatalog {
    
private String carManufacturername; // String
private String modelNumber; //String   
private String serialNumber; // String
private int numberofSeats;//int
private String Status; //String 
private String manufactureYear;// String
private String serviceCustomer; //String 
private String LastUpdated; //String 
private String ExpiredMaintenance; //boolean
private String City; //String 
private boolean isFiltered ;
{
    isFiltered = true;
}

    public boolean IsFiltered() {
        return isFiltered;
    }

    public void setIsFiltered(boolean isFiltered) {
        this.isFiltered = isFiltered;
    }


    public String getCarManufacturername() {
        return carManufacturername;
    }

    public void setCarManufacturername(String carManufacturername) {
        this.carManufacturername = carManufacturername;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getNumberofSeats() {
        return numberofSeats;
    }

    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getServiceCustomer() {
        return serviceCustomer;
    }

    public void setServiceCustomer(String serviceCustomer) {
        this.serviceCustomer = serviceCustomer;
    }

    public String getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(String LastUpdated) {
        this.LastUpdated = LastUpdated;
    }

    public String getExpiredMaintenance() {
        return ExpiredMaintenance;
    }

    public void setExpiredMaintenance(String ExpiredMaintenance) {
        this.ExpiredMaintenance = ExpiredMaintenance;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setcarManufacturername(String carManufacturername) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
