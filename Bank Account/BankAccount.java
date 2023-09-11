class BankAccount {
    private double checkingBalance;
    private double intRate;
    private double savingsBalance;
    private String accountType;
    public static int totalAccounts;
    public static double totalDeposits;


    public BankAccount(double balance, double intRate) {
        BankAccount.totalAccounts++;
        BankAccount.totalDeposits += getCheckingBalance();
        this.checkingBalance = balance;
        this.intRate = intRate;
    }

    public void deposit(double amount, String accountType) {
        if(accountType == "Savings") {
            this.savingsBalance += amount;
        } else{ 
            this.checkingBalance += amount;
        }
        // line 18 / 19 could also be implemented
        // this.balance += amount;
        // BankAccount.totalDeposits += amount;
    }
    public void withdrawal(double amount) {
        if (amount <= getCheckingBalance()) {
            this.checkingBalance -= amount;
            BankAccount.totalDeposits -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
        System.out.println();
    }
    // public void display(double )
    public void display(double checkingBalance, double savingsBalance) {
        this.checkingBalance += this.savingsBalance;
        System.out.println("Total amount of combined accounts");
    }




    @Override
    public String toString() {
        return "{" +
            " checkingBalance='" + getCheckingBalance() + "'" +
            ", intRate='" + getIntRate() + "'" +
            ", savingsBalance='" + getSavingsBalance() + "'" +
            ", accountType='" + getAccountType() + "'" +
            "}";
    }

// Getters and Setters


    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getIntRate() {
        return this.intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }



}
// The class should have the following attributes: (double) checking balance, (double) savings balance.