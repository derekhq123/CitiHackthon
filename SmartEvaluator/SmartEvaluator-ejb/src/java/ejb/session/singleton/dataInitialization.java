/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.singleton;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author xuhong
 */
@Singleton
@LocalBean
@Startup
public class dataInitialization {

    @PersistenceContext(unitName = "SmartEvaluator-ejbPU")
    private EntityManager em;

    public dataInitialization() {

    }

    @PostConstruct
    public void postConstruct() {

        
    }
}
