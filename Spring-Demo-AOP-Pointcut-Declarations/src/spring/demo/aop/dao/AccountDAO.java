
package spring.demo.aop.dao;

import org.springframework.stereotype.Component;
import spring.demo.aop.Account;

@Component
public class AccountDAO {
    
    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
