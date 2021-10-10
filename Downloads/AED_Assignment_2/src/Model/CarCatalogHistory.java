/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author bhavana
 */
public class CarCatalogHistory {
    
    private ArrayList<CarCatalog> history;
    
    public CarCatalogHistory(){
        this.history = new ArrayList<>();
     }

    public ArrayList<CarCatalog> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarCatalog> history) {
        this.history = history;
    }
    
    public CarCatalog addCarCatalog()
    {
        CarCatalog cc=new CarCatalog();
        this.history.add(cc);
        return cc;
       
    }
}
