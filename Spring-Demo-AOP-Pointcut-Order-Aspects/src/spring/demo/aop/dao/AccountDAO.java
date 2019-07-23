
package spring.demo.aop.dao;

import org.springframework.stereotype.Component;
import spring.demo.aop.Account;

@Component
public class AccountDAO {
    
    private String name;
    private String serviceCode;

    public String getName() {
        System.out.println("in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println("in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println("in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println("in setServiceCode()");
        this.serviceCode = serviceCode;
    }
    
    public boolean addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
        
        return true;
    }
    
    public void doWork(){
        System.out.println(getClass() + ": doWork()");
    }
}
