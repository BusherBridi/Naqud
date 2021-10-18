public class Portfolio {
    String name;
    String description;
    float netPay;

    // Constructor(String name, string description, float netpay)
    public Portfolio(String name, String description, float netPay) {
        this.name = name;
        this.description = description;
        this.netPay = netPay;
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

}
