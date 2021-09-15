package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.java.Bank;
import com.lti.java.SavingsAccount;

public class SavingsAccountTest {
	static SavingsAccount sa;
	
	@BeforeAll
	static void initialize() {
		
		sa = Bank.getObj();
		System.out.println("initialize "+sa);
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("setup() beforeEach invoked... ");
		sa = Bank.getObj() ;
		System.out.println("some coding 1... ");
		System.out.println("some coding 2... ");
		System.out.println("some coding 3... ");
		
	}
	
	@Test
	void test() {

        System.out.println("Testing the withdraw() method");
        System.out.println("Creating object...");

        String str="A"; // String str = something.getSomething();
        byte array[] = str.getBytes(); // = {10,20,30};

        assertTrue(array.length>0);
        System.out.println("running the for loop..");

        for(int x : array ) {
        	System.out.println(x+" x "+(char)x);
        }

        System.out.println("for loop is over...");
        assertNotNull(sa);

        System.out.println("Object created..."+sa.hashCode());
        double balanceBeforeWithdraw = sa.getAccBal();

        System.out.println("Invoking method");
        double amountToBeWithdrawn = 3500;

        Throwable throwable = assertThrows(RuntimeException.class, () -> 
        sa.withDraw(amountToBeWithdrawn));
        
        assertNotEquals("Insufficient balance exception",throwable.getMessage());
        assertEquals(balanceBeforeWithdraw-amountToBeWithdrawn,  sa.getAccBal() );

        assertTrue(sa.getAccBal() > 0 );
        System.out.println("Withdraw Method succeeded .."+sa.getAccBal());

        System.out.println("----------------------");

}
	
	@Test
	public void testToWithdraw() {
		System.out.println("Testing started : ... withdraw");
		
		assertTrue(14>5);
		System.out.println("passed1");	 

		assertTrue(24>5);
		System.out.println("passed2");

		assertTrue(34>5);
		System.out.println("passed3");
		
		SavingsAccount s = new SavingsAccount(101,"Yuvi",8000);
		System.out.println("Testing ended : ... withdraw");
	}

	@Test
	public void testWithdraw() {
		System.out.println("Testing started : ... withdraw");
		System.out.println("Creating object...");
		
		SavingsAccount sa = Bank.getObj();
	    System.out.println("Object created..."); 

	    assertNotNull(sa);
	    double balBefDeposit = sa.getAccBal();

		System.out.println("Invoking method");
	    double amtToBeDeposited = 3000;
	    
	    sa.deposit(amtToBeDeposited);
	    assertEquals(balBefDeposit+amtToBeDeposited, sa.getAccBal());
	    
		
	    System.out.println("Method succeeded ..");
		System.out.println("Testing ended : ... withdraw");
	}

}
