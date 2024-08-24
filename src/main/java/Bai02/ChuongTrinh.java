/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat fmt=new DecimalFormat("#,##0");
        Account ac1 =new Account("A01", "Lieu Hoang Phuc1", 100000);
        Account ac2 =new Account("A02", "Lieu Hoang Phuc2", 200000);
        
        System.out.println("----THONG TIN BAN DAU----");
        System.out.println("id: "+ac1.getId()+" - name: "+ac1.getName()+" - balance: "+fmt.format(ac1.getBalance()));
        System.out.println("id: "+ac2.getId()+" - name: "+ac2.getName()+" - balance: "+fmt.format(ac2.getBalance()));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien ac1 can nap: ");
        int credit1 = sc.nextInt();
        ac1.credit(credit1);
        System.out.print("Nhap so tien ac2 can nap: ");
        int credit2 = sc.nextInt();
        ac2.credit(credit2);
        
        System.out.println("----THONG TIN SAU CREDIT");
        System.out.println("id: "+ac1.getId()+" - name: "+ac1.getName()+" - balance: "+fmt.format(ac1.getBalance()));
        System.out.println("id: "+ac2.getId()+" - name: "+ac2.getName()+" - balance: "+fmt.format(ac2.getBalance()));
        
        
        ac1.debit(10000);
        ac2.debit(15000);
        System.out.println("----THONG TIN SAU DEBIT");
        System.out.println("id: "+ac1.getId()+" - name: "+ac1.getName()+" - balance: "+fmt.format(ac1.getBalance()));
        System.out.println("id: "+ac2.getId()+" - name: "+ac2.getName()+" - balance: "+fmt.format(ac2.getBalance()));
        
        ac1.tranferTo(ac2,10000 );
        System.out.println("----THONG TIN SAU TRANSFER");
        System.out.println("id: "+ac1.getId()+" - name: "+ac1.getName()+" - balance: "+fmt.format(ac1.getBalance()));
        System.out.println("id: "+ac2.getId()+" - name: "+ac2.getName()+" - balance: "+fmt.format(ac2.getBalance()));
    }
    
}
