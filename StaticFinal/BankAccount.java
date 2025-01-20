 class BankAccount{
   //Static variable to hold the name of bank
   static public String bankName = "Axis Bank";
   //Static variable to get total number of accounts
   static public int totalAccounts = 0;  
   
   //Instance variables to store other datas 
   int accountNumber;
   String accountHolder;
   
   //Constructor to intialie values 
   public BankAccount(String accountHolder , int accountNumber){
       this.accountHolder = accountHolder;
	   this.accountNumber = accountNumber;
   
   totalAccounts++;
   }
   
   //Method to get total count of the accounts created 
   public static void getTotalaccount(){
      System.out.println("Total number of accounts are : " + totalAccounts);
    }
	
	//Method to display all the data 
	public void display(){
	if(this instanceof BankAccount){
	   System.out.println("Account Holder name is " + accountHolder);
	   System.out.println("Account Number is " + accountNumber);
	   System.out.println("Name of the bank is  " + bankName);
	  }else{
         System.out.println("This account doesn't belong to Axis Bank");
        }
    }		
    
	public static void main(String[]args){
	  //Creating objects to pass the values 
	  BankAccount account1 = new BankAccount("Atharva" ,10000292);
	  BankAccount account2 = new BankAccount("Sharma" ,10000299);
	  
	  //Display the details 
	  account1.display();
	  System.out.println();
	  account2.display();

        // Display the total number of accounts
        BankAccount.getTotalaccount();

        // Check instanceof on a valid object
        if (account1 instanceof BankAccount) {
            System.out.println("\naccount1 is an instance of BankAccount");
        }

        // Attempt to check instanceof on a null reference
        BankAccount account3 = null;
        if (account3 instanceof BankAccount) {
            System.out.println("account3 is an instance of BankAccount");
        } else {
            System.out.println("account3 is not a valid instance.");
        }
    }
}