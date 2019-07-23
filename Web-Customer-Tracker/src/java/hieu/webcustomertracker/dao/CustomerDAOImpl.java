
package hieu.webcustomertracker.dao;

import hieu.webcustomertracker.entity.Customer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Customer> getCustomers() {
        Session sess = sessionFactory.getCurrentSession();
        
        Query<Customer> theQuery = sess.createQuery("from Customer order by lastName", Customer.class);
        
        List<Customer> customers = theQuery.getResultList();
        
        return customers;
    }
    
    @Override
    public void saveCustomer(Customer theCustomer){
        Session sess = sessionFactory.getCurrentSession();
        
        sess.saveOrUpdate(theCustomer);
    }
    
    @Override
    public Customer getCustomer(int theId){
        Session sess = sessionFactory.getCurrentSession();
        
        Customer theCustomer = sess.get(Customer.class, theId);
        
        return theCustomer;
    }

    @Override
    public void deleteCustomer(int theId) {
        Session sess = sessionFactory.getCurrentSession();
        
        Query theQuery = sess.createQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", theId);
        theQuery.executeUpdate();
    }

    @Override
    public List<Customer> searchCustomers(String theSearchName) {
        Session sess = sessionFactory.getCurrentSession();
        
        Query theQuery;
        
        if((theSearchName != null) && (theSearchName.trim().length() > 0)){
            theQuery = sess.createQuery("from Customer where lower(firstName) like :theName or "
                    + "lower(lastName) like :theName", Customer.class);
            
            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");
        }
        else{
            theQuery = sess.createQuery("from Customer", Customer.class);
        }
        
        List<Customer> customers = theQuery.getResultList();
        
        return customers;
    }
}
