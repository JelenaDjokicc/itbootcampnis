package domaci_17_05;

public class Transaction {
//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore

	private String transactionID;
	//private String trnasactionAccount;
	private Account account;
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
//	public String getTrnasactionAccount() {
//		return trnasactionAccount;
//	}
//	public void setTrnasactionAccount(String trnasactionAccount) {
//		this.trnasactionAccount = trnasactionAccount;
//	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Transaction(String transactionID,  Account account) {
		this.transactionID = transactionID;
	//	this.trnasactionAccount = trnasactionAccount;
		this.account = account;
	}
	private double commissionFee (double transactionAmount) {
		double commissionFee = 0;
		if (transactionAmount < 4500) {
			commissionFee = 45;
		}else if (transactionAmount > 4500) {
			commissionFee = transactionAmount * 0.01;
	}   
		return commissionFee;
	}
	
	public double transfer (double transactionAmount) { 	
		double transfer = 0;
		double transaction1;
		transaction1 = this.transfer(transactionAmount) + this.commissionFee(transactionAmount);
		transfer = this.account.getCurrentBalance() + transaction1;
		
		return transfer;
	}

		public void print () {
			System.out.println("Account from which the transaction is performed: " + this.account.getCustomerName() + this.account.getTransactionAccount());
			System.out.println("Account to which the transaction is performed: " + this.account.getCustomerName() + " - " + this.account.getAccountNumb());
		}
		
}     // POKUSACU DA URADIM ZADATAK KAKO TREBA, OVDE NEMAM POJMA STA SAM URADILA. 
       //KAD SAM VIDELA SLIKU, 
      //POKUSALA SAM DA ISPRAVIM, ALI JOS VISE SAM SE UPLELA.
