import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransacrions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        //does not return anything4
        transactions.add(transaction);
    }
}
