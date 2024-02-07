package BankingApplicaton;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String eMailID;
    private String phoneNumber;

    public Account(String accountNumber, double balance, String name, String eMailID, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.eMailID = eMailID;
        this.phoneNumber = phoneNumber;
    }
    public void depositMoney(double depositMoney){
        this.balance += depositMoney;
        System.out.println( "Deposit Successful ."+  "your money is deposited successfully , your balance is : "+ this.balance);
    }

    public void withdrawMoney(double withdrowMoney){
        if (this.balance-withdrowMoney < 0){
            System.out.println( "Withdraw Unsuccessful . " + "your account haven't sufficient balance , your current balance is : " + this.balance);
        }else {
            this.balance -=withdrowMoney ;
            System.out.println( "Withdraw Successful . " + " your current balance is : " + this.balance);

        }
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMailID() {
        return eMailID;
    }

    public void seteMailID(String eMailID) {
        this.eMailID = eMailID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
