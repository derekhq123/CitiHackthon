/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managedBean;

import ejb.session.stateless.HomeBuyerControllerLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hongxu
 */
@Named(value = "homeBuyerManagedBean")
@RequestScoped
public class HomeBuyerManagedBean {

    @EJB(name = "HomeBuyerControllerLocal")
    private HomeBuyerControllerLocal homeBuyerControllerLocal;

    /**
     * Creates a new instance of HomeBuyerManagedBean
     */
    public HomeBuyerManagedBean() {
    }
    
}
