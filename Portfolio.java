import java.util.Scanner;
import java.util.ArrayList;

public class Portfolio {

    private String name;
    private String description;
    private float netPay;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private int currentTransactionID = 0;

    // Constructor(String name, string description, float netpay)
    public Portfolio(String name, String description, float netPay) {
        this.name = name;
        this.description = description;
        this.netPay = netPay;
    }

    public static Portfolio userSetup(Scanner sc) {
        String name, description;
        float netPay;
        System.out.println("Potfolio Set Up");
        System.out.println("Enter Portfolio Name:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter Portfolio Description:");
        description = sc.nextLine();
        System.out.println("Enter net pay:");
        netPay = sc.nextFloat();
        Portfolio returnPortfolio = new Portfolio(name, description, netPay);
        return (returnPortfolio);
    }

    public String get_name() {
        return (name);
    }

    public String get_description() {
        return (description);
    }

    public float get_netPay() {
        return (netPay);
    }

    public ArrayList<Transaction> get_allTransactions() {
        return (transactions);
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public void set_netPay(float netPay) {
        this.netPay = netPay;
    }

    public void print() {
        System.out.println("---------------------------------");
        System.out.printf("Name: %s\n Description: %s\n Net Pay: %f\n", this.name, this.description, this.netPay);
        System.out.println("---------------------------------");
    }

    public void addTransaction(String name, float amount, String memo) {
        transactions.add(new Transaction(name, amount, memo, this, currentTransactionID));
        currentTransactionID++; // Ensures that each transaction object related to this potfolio object has a
                                // unique ID
    }

    public float calculateFutureBalance(int months) {
        return (netPay * months);
    }
}
