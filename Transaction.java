
public class Transaction {
    private float amount;
    private String name;
    private String memo;
    private Portfolio portfolio;
    private int id;

    /**
     * Constructor method for the Transaction Class. A Transaction cannot exist
     * without a potfolio owner. Has a One-way ownership relation with the portfolio
     * class (Transaction is owned by Portfolio). The responsibilty to ensure the
     * uniquness of the id variable is abstracted to the parent potfolio class.
     * 
     * @param name      Front facing name of transaction object
     * @param amount    Net amount of transaction in relation to portfolio (-/+)
     * @param memo      Short note regarding what the transaction is for
     * @param portfolio Parent Potfolio object
     * @param id        unique id to identify the transaction
     */
    public Transaction(String name, float amount, String memo, Portfolio portfolio, int id) {
        this.name = name;
        this.amount = amount;
        this.memo = memo;
        this.portfolio = portfolio;
        this.id = id;
    }

    // Getters
    public float get_amount() {
        return (amount);
    }

    public String get_name() {
        return (name);
    }

    public String get_memo() {
        return (memo);
    }

    public int get_id() {
        return (id);
    }

    // Setters
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
