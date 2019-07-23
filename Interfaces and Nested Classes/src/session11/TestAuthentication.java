package session11;

class Authenticate{
    //Anonymous class
    Account objAcc = new Account(){
        @Override
        public void displayBalance(String accNo){
            System.out.println("Retrieving balance. Please wait...");
            System.out.println("Balance of account number "
            + accNo.toUpperCase() + " is $40000");
        }
    };
}

class Account{
    public void displayBalance(String accNo){  
    }
}

public class TestAuthentication {
    public static void main(String[] args){
        Authenticate objUser = new Authenticate();
        if(args.length == 3){
            if(args[0].equals("admin") && args[1].equals("abc@123")){
                objUser.objAcc.displayBalance(args[2]);
            }
            else{
                System.out.println("Unauthorized user");
            }
        }
        else{
            System.out.println("Usage: java Authenticate <user-name>"
                    + "<password> <account-no");
        }
    }
}