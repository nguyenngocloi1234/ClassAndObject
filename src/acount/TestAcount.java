package acount;

import java.time.LocalDate;

public class TestAcount {
    public static void main(String[] args) {
        Acount acount = new Acount(1122,20000);
        acount.setDateCreated(LocalDate.now());
        System.out.println("id: "+acount.getId()+ ", balance: "+acount.getBalance()+"date: "+acount.getDateCreated());
        acount.setAnnualInterestRate(4.5);
        acount.withdraw(5000);
        acount.deposit(6000);

    }
}
