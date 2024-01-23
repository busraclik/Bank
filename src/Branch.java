import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private boolean newCustomer(String name, double initialTransaction){
        //return true if customer added successfully otherwise return true
        Customer newCustomer = new Customer(name, initialTransaction);
        if (findCustomer(name) == null){
            customers.add(newCustomer);
            return true;
        }
            System.out.println("Customer has been found alreay.");
            return false;
    }


    private boolean addCustomerTransaction(String name, double transaction){
        //return true if customer transaction added successfully otherwise return true
        if (findCustomer(name) != null){
            findCustomer(name).addTransaction(transaction);
            return true;
        }else{
            return false;
        }
    }

    private Customer findCustomer(String customerName){
        //if customer exists return customer otherwise return null
        for (var customer : customers) {
         if(customer.getName().equalsIgnoreCase(customerName)){
             return customer;
         }
        }
        System.out.println("Customer " + customerName + " is not found.");
        return null;
    }


}
