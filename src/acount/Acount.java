package acount;
import java.time.LocalDate;

import java.time.LocalDate;
import java.util.Date;

public class Acount {

    private int id =0;
    private double balance =0;
    private double annualInterestRate =0;
    private LocalDate dateCreated;

    public Acount() {
    }

    public Acount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/(12);
    }

    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate()/100;
    }

    public void withdraw(double money){
        this.balance = this.balance -money;
        System.out.println("rut ra: "+money+ ", balance: "+this.balance);


    }
    public void deposit(double money){
        this.balance = this.balance + money;
        System.out.println("gui vao: "+money+ ", balance: "+this.balance);
    }
}
