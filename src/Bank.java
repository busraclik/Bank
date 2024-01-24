import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        //new branch will add
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        //return true if successfully added customer
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }




    public boolean  addCustomerTransaction(String branchName, String customerName, double transaction){
    //return true if customer transaction added successfully

        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;

    }




    public Branch findBranch(String branchName){
        //return branc if exists otherwise return null
        for (var branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }



    public void listCustomers(String branchName, boolean isTransacrionsLists){
        //return true if branch exists otherwise print list of cusotmers

     Branch branch = findBranch(branchName);
     if (branch != null){
         ArrayList<Customer> list = branch.getCustomers();
         for (Customer c : list){
             System.out.println("Customer Name : " + c.getName());
             ArrayList<Double> transactionList = c.getTransacrions();

             if(isTransacrionsLists) {
                 for (double d : transactionList) {
                     System.out.println("transaction : " + d);
                 }
             }else{
                 System.out.println("transaction size : " + transactionList.size());
             }
             System.out.println("--------------");
         }
     }

    }




//public boolean listCustomers(String branchName, boolean showTransactions) {
//
//    Branch branch = findBranch(branchName);
//    if (branch != null) {
//        System.out.println("Customer details for branch " + branch.getName());
//        ArrayList<Customer> branchCustomers = branch.getCustomers();
//        for (int i = 0; i < branchCustomers.size(); i++) {
//            Customer branchCustomer = branchCustomers.get(i);
//            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
//            if (showTransactions) {
//                System.out.println("Transactions");
//                ArrayList<Double> transactions = branchCustomer.getTransacrions();
//                for (int j = 0; j < transactions.size(); j++) {
//                    System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
//                }
//            }
//        }
//        return true;
//    }
//    return false;
//}


}





