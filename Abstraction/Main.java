public class Main {
public static void main(String[] args) {
        BankA person1 = new BankA();
        person1.Account("121212",0,"Abhay","abhay@xyz.com","1212121");
       System.out.println(person1.getName());
     //  person1.DepositMoney(50);
      person1.DepositMoney(1500);
       person1.WithDrawMoney(100);
   
    }
}