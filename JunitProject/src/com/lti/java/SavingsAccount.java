package com.lti.java;

public class SavingsAccount {
		
	private int accNum;
	private String accHolder;
	private double accBal;
		
	public SavingsAccount(int accNum, String accHolder, double accBal) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBal=" + accBal + "]";
	}
		
	public void withDraw(double amtToWithdraw){
		if(amtToWithdraw > accBal ){
			throw new RuntimeException("Insufficient balance exception");
		}
		
		this.accBal = this.accBal - amtToWithdraw;
	}
		
	public void deposit(double amtToDeposit){
		this.accBal = this.accBal + amtToDeposit;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
		
		
}


		
		
		
		
		
		
		
		
		
		
		
		



