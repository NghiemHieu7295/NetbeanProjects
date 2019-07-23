package session11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class AtmMachine{
    //static nested class
    static class BankDetails{
        static Calendar objNow = Calendar.getInstance();
        
        public static void printDetails(){
            System.out.println("State Bank of America");
            System.out.println("Branch: New York");
            System.out.println("Code: K3983LKSIE");
            SimpleDateFormat objFormat = new SimpleDateFormat("dd"
            + "/MM/yyyy HH:mm:ss");
            System.out.println("Date-Time: "
                    + objFormat.format(objNow.getTime()));
        }
    }
    
    public void displayBalance(String accNo){
        System.out.println("Balance of account number "
        + accNo.toUpperCase() + " $200000");
    }
}

public class TestATM {
    public static void main(String[] args){
        if(args.length == 1){
            AtmMachine objAtm = new AtmMachine();
            AtmMachine.BankDetails.printDetails();
            objAtm.displayBalance(args[0]);
        }
        else{
            System.out.println("Usage: java AtmMachine <account-no>");
        }
    }
}