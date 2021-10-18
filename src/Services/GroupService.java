package Services;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import Repository.GroupRepository;
import models.Group;
import models.Txn;
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
        //Todo
        //Code To be added here
        // get grp expenses list
        // accumulate as per the users
        // make transaction summary and print it.
        // Map<User,Float> usersNetBalance = cummulateExpenses();
        Map<User,Float> usersNetBalance = grp.getMembersNetBal();
        ArrayList<User> payers= new ArrayList<>();
        ArrayList<User> receivers= new ArrayList<>();

        ArrayList<Txn> txns =new ArrayList<>();
        
        txns= offsetTxns(payers, receivers, txns);

        //update the txns 
        TxnService txnService = new TxnService();
        txnService.addTxns(txns);

        // minTxns=getMinTxns();
        grp.setSettled();
        return true;
    }
    public Group createGrp(User user){
        Group grp=this.grpRepo.CreateGroup(user);
        return grp;
    }
    private ArrayList<Txn> offsetTxns(ArrayList<User> payers,ArrayList<User> receivers,ArrayList<Txn> txns){
        // get max payer from the payers list
        //User maxPayer= Collections.max(payers);


        //get max from the receivers list

        //offset the maxs and repeat

        return txns;
    }
    // public ArrayList<Expense> getExpenseList(){

    // }

    // public Map<User,Float> cummulateExpenses(){

    // }
    // public addExpense(){
        
    // }
    

}
