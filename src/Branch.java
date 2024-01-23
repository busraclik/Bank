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

    public boolean newCustomer(String name, double initialTransaction){
        //return true if customer added successfully otherwise return false

        if (findCustomer(name) == null){
            customers.add(new Customer(name, initialTransaction));
            return true;
        }

            return false;
    }


    public boolean addCustomerTransaction(String name, double transaction){
        //return true if customer transaction added successfully otherwise return true
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransaction(transaction);
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
        return null;
    }


}
