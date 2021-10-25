
import java.util.Scanner;
import java.util.ArrayList;

public class Portfolio {

    private String name;
    private String description;
    private RecurringTransaction netPay;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private int currentTransactionID = 0;
    private float total = 0;

    // Constructor(String name, string description, float netpay)
    public Portfolio(String name, String description, float netPay) {
        this.name = name;
        this.description = description;
        this.netPay = new RecurringTransaction("Income", netPay, "Net Income Pay", this, currentTransactionID, 1);
        transactions.add(this.netPay);
        currentTransactionID++;
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
        return (netPay.get_amount());
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
        this.netPay.set_amount(netPay);
    }

    public void print() {
        System.out.println("---------------------------------");
        System.out.printf("Name: %s\nDescription: %s\nNet Pay: %f\n", this.name, this.description,
                this.netPay.get_amount());
        System.out.println("---------------------------------");
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println("----");
            if (transaction instanceof RecurringTransaction) {
                System.out.printf("Name: %s\nAmount: %f\nMemo: %s\nRecurs every %d month(s)\n", transaction.get_name(),
                        transaction.get_amount(), transaction.get_memo(),
                        ((RecurringTransaction) transaction).get_recurrance());
            } else {
                System.out.printf("Name: %s\nAmount: %f\nMemo: %s\n", transaction.get_name(), transaction.get_amount(),
                        transaction.get_memo());
            }
        }
    }

    public void addTransaction(String name, float amount, String memo) {
        transactions.add(new Transaction(name, amount, memo, this, currentTransactionID));
        this.currentTransactionID++; // Ensures that each transaction object related to this potfolio object has a
                                     // unique ID
        this.total += amount;
    }

    public void addRecurringTransaction(String name, float amount, String memo, int recurrance) {
        transactions.add(new RecurringTransaction(name, amount, memo, this, currentTransactionID, recurrance));
        this.currentTransactionID++;
    }

    public float calculateFutureBalance(int months) {
        float total = 0;
        for (Transaction transaction : transactions) {
            if (transaction instanceof RecurringTransaction) {
                total += transaction.get_amount();
            }
        }
        return (total * months);

    }
}
