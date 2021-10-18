package models;

import java.util.ArrayList;
import java.util.Map;

public class Group extends BaseModel {
    private ArrayList<User> members;
    private ArrayList<Expense> expenses;
    private ArrayList<Txn> txns;
    private Boolean isSetteled;
    private ArrayList<User> adminUsers; // only 1 admin user supported
    private Map<User,Float> membersNetBal;
    
    public Group (ArrayList<User> grpMembers){
        this.members=grpMembers;
        this.adminUsers=grpMembers;
        this.expenses = new ArrayList<Expense>();
        this.txns = new ArrayList<Txn>();
    }
    public ArrayList<User> getAdminUsers(){
        return this.adminUsers;
    }
    public ArrayList<User>getUsers(){
        return this.members;
    }
    public void setmembersNetBal(Map<User,Float> usersNetBal){
        this.membersNetBal=usersNetBal;
        return;
    }
    public Map<User, Float> getMembersNetBal() {
        return membersNetBal;
    }
    public ArrayList<Expense> getexpenses(){
        return this.expenses;
    }
    public ArrayList<User> getGrpMembers(){
        return this.members;
    }
    public ArrayList<Txn> getTxns(){
        return this.txns;
    }
    public Boolean isSettled(){
        return this.isSetteled;
    }
    public Boolean setSettled(){
        this.isSetteled=true;
        return this.isSetteled;
    }
    public Expense addExpense(Expense expense){
        this.expenses.add(expense);
        return this.expenses.get(this.expenses.size()-1);
    }
    public ArrayList<User> adduser(User u){
        this.members.add(u);
        this.membersNetBal.put(u,0f); // update grp member net balance
        return this.members;
    }





}
