package practice.generic;

import lombok.Data;

/**
        Generic unbound
        Account<T> account = new Account<T>();
        SavingAccount
        CurrentAccount
        LoanAccount
        FdAccound
        RdAccount
        SalaryAccount
**/

class SavingAccount{
    public void accountDetails(){
        System.out.println("This Saving Account");
    }
}

class CurrentAccount{

    public void accountDetails(){
        System.out.println("This Current Account");
    }
}

class LoanAccount{

    public void accountDetails(){
        System.out.println("This Loan Account");
    }
}

class FDAccound{

    public void accountDetails(){
        System.out.println("This FD Account");
    }
}

class RDAccount{

    public void accountDetails(){
        System.out.println("This RD Account");
    }
}

class SalaryAccount{

    public void accountDetails(){
        System.out.println("This Salary Account");
    }
}

//@Data
public class Account<T>{

    T accountNumber;
    T accountHolder;
    T accountType;

    public Account() {
    }

    public Account(T accountNumber, T accountHolder, T accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }


    public static void main(String[] args){
        Account<SalaryAccount> account = new Account<SalaryAccount>();
    }
}
