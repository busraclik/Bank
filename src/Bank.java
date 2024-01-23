import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        //new branch will add
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        System.out.println("this branch has been already.");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        //return true if successfully added customer
        findBranch(branchName).getCustomers().add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean  addCustomerTransaction(String branchName, String customerName, double transaction){
    //return true if customer transaction added successfully
    }

    public Branch findBranch(String branchName){
        //return branc if exists otherwise return null
        for (var branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        System.out.println("Branch has not been found.");
        return null;
    }

    public boolean listCustomers(String branchName, boolean transacrions){
        //return true if branch exists otherwise print list of cusotmers
    }

}
