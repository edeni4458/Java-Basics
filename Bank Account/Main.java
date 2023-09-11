import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

class Main {
    public static void main(String[] args) {
        BankAccount Eric = new BankAccount(10000, 0);
        System.out.println(Eric);
        
        System.out.println("Eric made a deposit\n==========");
        Eric.deposit(1000, "Checking");
        
                BankAccount Joe = new BankAccount(0, 0);
        System.out.printf("Welcome to your new account Joe\n");
        System.out.println(Joe);
        
        System.out.println("=====================");
        System.out.println("Eric attempts to withdraw $50000");
        Eric.withdrawal(50000);
        System.out.println(Eric);
        
        System.out.println("Eric deposits $200 into his savings account");
        Eric.deposit(200, "Savings");
        System.out.println(Eric);

        System.out.println("The Bank's Account List");
        System.out.println(BankAccount.totalAccounts);
        System.out.println(BankAccount.totalDeposits);

        System.out.println("==================\nTesting test account");
        BankAccount test = new BankAccount(500, 0);
        test.deposit(500, null);
        test.deposit(200, "Savings");
        test.withdrawal(20000);
        test.withdrawal(200);
        System.out.println(test);
    }    
}
