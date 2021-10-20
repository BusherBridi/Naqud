import java.util.Scanner;

public class Portfolio {

    private String name;
    private String description;
    private float netPay;

    // Constructor(String name, string description, float netpay)
    public Portfolio(String name, String description, float netPay) {
        this.name = name;
        this.description = description;
        this.netPay = netPay;
    }

    public static Portfolio userSetup() {
        Scanner sc = new Scanner(System.in);
        String name, description;
        float netPay;
        System.out.println("Potfolio Set Up");
        System.out.println("Enter Portfolio Name:");
        System.out.println("");
        name = sc.nextLine();
        System.out.println("Enter Portfolio Description:");
        description = sc.nextLine();
        System.out.println("Enter net pay:");
        netPay = sc.nextFloat();
        sc.close();
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

}
