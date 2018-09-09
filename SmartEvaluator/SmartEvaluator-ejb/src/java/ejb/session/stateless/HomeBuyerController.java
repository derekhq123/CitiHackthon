/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import javax.ejb.Stateless;
import entity.HomeBuyer;
import entity.House;        
import java.util.ArrayList;
import ejb.session.singleton.dataInitialization;
/**
 *
 * @author hongxu
 */
@Stateless
public class HomeBuyerController implements HomeBuyerControllerLocal {
    ArrayList <House> returnHouseList=new ArrayList<>();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public ArrayList <House>  getHouseList(HomeBuyer buyer){
        //get info from buyer
        //logic function
        //get money
        //loop over houselist in datainit class
        //get house
//        System.out.print(dataInitialization.houseList);
        //find proper house
        return returnHouseList;
    }
   
}
