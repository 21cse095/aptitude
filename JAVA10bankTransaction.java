/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class bankTransaction {
  public static void main(String[] args) {
        // Create Account A with an initial balance of 5000
        bankAccount accountA = new bankAccount(12344, "Account A", 5000);

        // Create Account B with an initial balance of 2500
        bankAccount accountB = new bankAccount(56789, "Account B", 2500);

        // Transfer amount of 1500 from Account A to B
        accountA.transferTo(accountB, 1500);

        // Print Account A details after the first transaction
        System.out.println("Account A Balance after the first transaction: Rs." + accountA.getBalance());
        System.out.println();

        // Transfer amount of 3000 from Account B to A
        accountB.transferTo(accountA, 3000);

        // Print Account A details after the second transaction
        System.out.println("Account A Balance after the second transaction: Rs." + accountA.getBalance());
    }  
}
