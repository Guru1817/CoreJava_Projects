package BankingApplicaton;

public class Main {
    public static void main(String[] args) {
        Account account1= new Account("18171235",0.0,"Jyotiprakash","juju@gmail.com" ,"7735287196");
//       String s1=  account1.getAccountNumber();
//        System.out.println(s1);

        account1.depositMoney(100);
        account1.depositMoney(100);
        account1.withdrawMoney(150);
        account1.withdrawMoney(150);

    }
}
