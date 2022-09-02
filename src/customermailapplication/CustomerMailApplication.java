/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {   
    public static void main(String[] args) {
        Customer customer = null;
        CustomerFactory factory = new CustomerFactory();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customer = factory.createCustomer("Regular");
                break;
            case 2:
                customer = factory.createCustomer("Mountain");
                break;
            case 3:
                customer = factory.createCustomer("Delinquent");
                break;
            
        }
        inp.close(); 
        System.out.println(customer.createMail());  
    }
}
