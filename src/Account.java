/**
 * Created by ryankielty on 11/16/16.
 */
public class Account {
    private String name;
    private String service;
    private int balance = 100;

    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        System.out.println("Greetings " + name);
    }

    public void chooseService() throws Exception {
        System.out.println("Please select a transaction");
        System.out.println("1 > Account Balance");
        System.out.println("2 > Withdrawal");
        System.out.println("3 > Cancel Transaction");
        service = ATM.scanner.nextLine();
        if (service.equalsIgnoreCase("1")) {
            System.out.println("Balance : $" + 100);
        } else if (service.equalsIgnoreCase("2")) {
            System.out.println("Withdrawal");
        } else if (service.equalsIgnoreCase("3")) {
            System.out.println("Thank you for choosing City Bank, and until next time!");
        } else {
            throw new Exception("Invalid Selection");
        }
    }

    public void chooseBalance() throws Exception {
        System.out.println("How much would you like to withdrawal?");
        balance = ATM.scanner.nextInt();
        if (balance <= 100) {
            System.out.println("Please collect your funds");
            System.out.println("Remaining Balance : $" + (100-balance));
            System.out.println("Thank you for choosing City Bank!");
        } else if (balance > 100) {
            throw new Exception("Insufficient Funds in Account");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
