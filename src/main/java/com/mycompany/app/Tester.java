package com.mycompany.app;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Tester{
    private static Tester TEST;
    int someNum;
    List<LocalAccount> test2 = new ArrayList<LocalAccount>();

    public static void main(String[] args) {
        
        Tester test = getTester();
        test.manageAccounts();
    }

    private Tester(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many accounts are we working on today -->");
        someNum = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < someNum; i++){
            test2.add(new LocalAccount());
        }
    }

    public static Tester getTester(){
        if(TEST == null){
            TEST = new Tester();
        }

        return TEST;
    }

    public void manageAccounts(){
        Scanner sc = new Scanner(System.in);
        boolean quitF = false;
        do{
            System.out.println("What do you want to do to these accounts -->");
            String someStr = sc.nextLine();

            switch(someStr){
            case "deposit":
                for(int i = 0; i < someNum; i++){
                    test2.get(i).deposit();
                    test2.get(i).setAccount();
                }
                break;
            case "withdraw":
                for(int i = 0; i < someNum; i++){
                    test2.get(i).withdraw();
                    test2.get(i).setAccount();
                }
                break;
            case "quit":
                quitF = true;
                break;
            default:
                System.out.println("Commands are: deposit, withdraw, quit");
                break;
            }
        }while(quitF == false);
    }


}