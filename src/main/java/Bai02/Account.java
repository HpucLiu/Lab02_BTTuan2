/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int credit(int amount){
        
        if(amount>0)
            balance += amount;
        return amount;
    }
    
    public void debit(int amount){
        if(amount>0 && amount <= balance)
            balance-=amount;
        else
            System.out.println("Thanh toan khong thanh cong");
        
    }
    
    public void tranferTo(Account other , int amount ){
        if(amount<=balance){
            balance+=amount;
            other.balance-=amount;
        }
        
    }
}
