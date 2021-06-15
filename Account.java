package domaci_17_05;

public class Account {
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	private String accountNumb;
	private String customerName;
	private double currentBalance;
	private String transactionAccount;
	
	public String getTransactionAccount() {
		return transactionAccount;
	}
	public void setTransactionAccount(String transactionAccount) {
		this.transactionAccount = transactionAccount;
	}
	public String getAccountNumb() {
		return accountNumb;
	}
	public void setAccountNumb(String accountNumb) {
		this.accountNumb = accountNumb;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public boolean changeBalance (double amount) {
		boolean changeBalance = false;
		if (this.currentBalance > 0) {
			this.currentBalance = 0;
		}else if (this.currentBalance  >= amount) {
			changeBalance = true;
		}return changeBalance;
	 } 
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	public void print () {
		System.out.println(this.customerName + " - " + this.accountNumb);
		System.out.println("The account balance is: " + this.currentBalance + " rsd.");
	}
	
}
