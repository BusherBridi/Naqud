public class Transaction {
    private float amount;
    private String name;
    private String memo;

    public Transaction(String name, float amount, String memo) {
        this.name = name;
        this.amount = amount;
        this.memo = memo;
    }

    public float get_amount() {
        return (amount);
    }

    public String get_name() {
        return (name);
    }

    public String get_memo() {
        return (memo);
    }

    public void set_amount(float amount) {
        this.amount = amount;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_memo(String memo) {
        this.memo = memo;
    }
}
