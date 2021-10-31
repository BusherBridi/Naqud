
public class RecurringTransaction extends Transaction {
    private int recurrancePeriod;

    public RecurringTransaction(String name, float amount, String memo, Portfolio portfolio, int id,
            int recurrancePeriod) {
        super(name, amount, memo, portfolio, id);
        this.recurrancePeriod = recurrancePeriod;

    }

    public int get_recurrance() {
        return (recurrancePeriod);
    }
}