package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testCTORwithInt(){
        LocalAccount tester = new LocalAccount(100.00);
        assertEquals(100, tester.getBalance(), "account should have 100.00 in it");
    }

    @Test
    public void testCTOR(){
        LocalAccount tester = new LocalAccount();
        System.out.println("testAccount.txt is the test account");

        tester.getAccount();
        assertEquals(100, tester.getBalance(), "account should have 100.00 in it");
    }

    @Test
    public void testWithdraw(){
        LocalAccount tester = new LocalAccount(100.00);
        System.out.println("type 50 to test withdraw");
        tester.withdraw();
        assertEquals(50, tester.getBalance(), "account should have 50.00 in it");
    }

    @Test
    public void testDeposit(){
        LocalAccount tester = new LocalAccount(100.00);
        System.out.println("type 50 to test deposit");
        tester.deposit();
        assertEquals(150, tester.getBalance(), "account should have 150.00 in it");
    }
}
