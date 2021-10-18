package Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import models.Expense;
import models.Group;
import models.User;
import models.Pair;
import models.Txn;

public class UserService {
    private static UserService userService=null;

    public static UserService getInstance(){
        if (userService==null){
            UserService userService = new UserService();
        }
        return userService;
    }
    public Group createGrp(User user){ 
        //TODO
        // shall I create a grp in User service w/o asking grp service?
        ArrayList<User> users=new ArrayList<>();
        Group grp = new Group(users);
        return grp;
    }

    public Expense addExpense(Group grp,Expense expense){
        return grp.addExpense(expense);       
    }

    public String askToSettle(User reqUser,Group grp){
        //TODO
        // Calculate the net balance for each user
        // greedily offset the txns
        // update the Txns for each user
        Map<User,Float> userNetBal= grp.getMembersNetBal();
        ArrayList<Pair> creditors = new ArrayList<Pair>();
        ArrayList<Pair> borrowers = new ArrayList<Pair>();
        
        for(User user: grp.getGrpMembers()){
            if (userNetBal.getOrDefault(user, 0f)<0){
                Pair obj =new Pair<>(user,userNetBal.get(user));
                borrowers.add(obj);
            }
            else if(userNetBal.getOrDefault(user, 0f)>0){
                Pair obj =new Pair<>(user,userNetBal.get(user));
                creditors.add(obj);
            }
            ArrayList<Txn> txns=getminTxns(creditors,borrowers);
            //TODO
            // get Txns object from algo
            //update the Txn model
            TxnService txnService = new TxnService();
            //save the txn object in txns Rerpo
            // shall Txn model have the ArrayList<Txns>?

        }

        //aply greedy algo to get txns

        // get expenses list
        // calculate the net balance for each user
        // calc

        return "fail";
    }

    public ArrayList<Txn> getminTxns(ArrayList<Pair> creditors,ArrayList<Pair> borrowers){
        ArrayList<Txn> txns=new ArrayList<Txn>();
        
        return txns;

    }

    public Boolean isMemberofGroup(User user, Group grp){
        if (grp.getUsers().contains(user)){
            return true;
        }
        return false;
    }
    public Map<User,Float>  updUserNetBal(Expense expense,Group grp){
        // ToDo
        // get share of each user
        // update the net balnce of participants in grp
        //return the object
        Map<User,Float> contribs = expense.getContributors();
        Map<User,Float> receivers = expense.getPayees();

        Map<User,Float> usersNetBal = grp.getMembersNetBal();
        
        
        ArrayList<User> members = grp.getGrpMembers();
        for (User user : members) {
            usersNetBal.put(user,usersNetBal.get(user)+contribs.getOrDefault(user,0f)
            -receivers.getOrDefault(user, 0f));
        }

        return usersNetBal;

     }





}
