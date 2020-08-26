package bankfacade;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;

public class myfacade {
  ArrayList<CustomerIf> customers = new ArrayList();
  Facade(){
    
    ArrayList<AccountIf> cust1Accounts = new ArrayList();
    AccountIf account = new BankAccount(12345);
    account.deposit(500);
    cust1Accounts.add(account);
    account = new BankAccount(12346);
    account.deposit(700);
    cust1Accounts.add(account);
    CustomerIf customer1 = new BankCustomer("John", cust1Accounts);
    customers.add(customer1);
     
     
     ArrayList<AccountIf> cust2Accounts = new ArrayList();
     account = new BankAccount(45612);
        account.deposit(500);
        cust2Accounts.add(account);
        account = new BankAccount(45613);
        account.deposit(700);
        cust2Accounts.add(account);
        CustomerIf customer2 = new BankCustomer("beer", cust2Accounts);
        customers.add(customer2);
  }
  
    
     public void  doDeposit(double amt, CustomerIf cust, int accNo){
      cust.getAccount(accNo).deposit(amt);
     }

     public void  getBankAccount(CustomerIf cust, int accNo){
      return cust.getAccount(accNo);
     }

     public void  getBanCustomer(String custName){
      for(CustomerIf cus : customers){
        if(cus.getCustomerName().equals(custName)){
           return cus;
          }
        }
       return null;
     }

    
     
    
    
}