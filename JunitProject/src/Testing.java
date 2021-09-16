
class SavingsAccount{
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
		this.accBal = this.accBal - amtToWithdraw;
	}
	
	public void deposit(double amtToDeposit){
		this.accBal = this.accBal + amtToDeposit;
	}
	
	
}

public class Testing{

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(101,"Yuvi",8000);
		System.out.println("Savings :" +s);
		
	}
}