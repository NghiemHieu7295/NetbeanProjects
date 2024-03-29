
package spring.demo.aop.dao;

import java.util.ArrayList;
import java.util.List;
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
    
    public List<Account> findAccounts(){
        List<Account> myAccounts = new ArrayList<>();
        Account temp1 = new Account("John", "Silver");
        Account temp2 = new Account("Madhu", "Platinum");
        Account temp3 = new Account("Luca", "Gold");
        
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);
        
        return myAccounts;
    }
    
    public boolean addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
        
        return true;
    }
    
    public void doWork(){
        System.out.println(getClass() + ": doWork()");
    }
}
