package com.mycompany.app;

import java.io.*;
import java.util.Scanner;

public class LocalAccount extends Account{
    double balance; //Balance of account
    String aName; //Account name

    //CTOR
    LocalAccount(){
        getAccount();
    }

    LocalAccount(double depositB){
        this.balance = depositB;
    }

    @Override
    void setAccount(){
        try(FileWriter ops = new FileWriter(aName)){
            ops.write(Double.toString(balance));
        } catch (IOException ex){
            System.out.println("Problem submitting information. ");
        }
    }

    @Override
    void getAccount(){
        boolean uCheck = true;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter Account Name --> ");
            aName= sc.nextLine();
            uCheck = true;

            //read in from file
            try(BufferedReader fr = new BufferedReader(new FileReader(aName))){
                balance = Double.parseDouble(fr.readLine()); //read in the number of rooms to make
            } catch (FileNotFoundException ex){
                System.out.println("Account not found please try again. ");
                uCheck = false;
            } catch (IOException ex) {
                System.out.println("There is a problem with the account");
                uCheck = false;
            }
        }while(uCheck == false);
    }

    @Override
    double getBalance(){
        return balance;
    }

    @Override
    void deposit(){
        double credit = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit Amount --> ");
        credit = Double.valueOf(sc.nextLine());

        balance += credit;
    }

    @Override
    void withdraw(){
        double debit = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter debit Amount --> ");
        debit = Double.valueOf(sc.nextLine());

        balance -= debit;
    }
}