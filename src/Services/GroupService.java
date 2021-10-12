package Services;

import Repository.GroupRepository;
import models.Group;
import models.User;

public class GroupService {
    private static GroupService grpService=null;
    private GroupRepository grpRepo;
    public static GroupService getInstance(){
        if (grpService==null){
            grpService=new GroupService();
            GroupRepository grpRepo = new GroupRepository();
        }
        return grpService;
        
    }

    public Boolean settleup(Group grp){
        //Code To be added here
        // get grp expenses list
        // accumulate as per the users
        // make transaction summary and print it.
        // Map<User,Float> usersNetBalance = cummulateExpenses();

        // minTxns=getMinTxns();
        grp.setSettled();
        return true;
    }
    public Group createGrp(User user){
        Group grp=this.grpRepo.CreateGroup(user);
        return grp;
    }
    // public ArrayList<Expense> getExpenseList(){

    // }

    // public Map<User,Float> cummulateExpenses(){

    // }
    // public addExpense(){
        
    // }
    

}
