package models;
import java.util.Map;
import java.util.ArrayList;
import models.BaseModel;
import Config.Constants;

public class Expense extends BaseModel{
 
    private Map <User,Float> contributors;
    private Float amt;
    private Map<User,Float> payees;
    private Constants.SplitStrategy splitStrategy;
    private Group grp;
    private User creator;
    private User admin;

    public Float getExpenseAmt(){
        return this.amt;
    }
    public Map<User,Float> getContributors(){
        return this.contributors;
    }
    public Map<User,Float> getPayees(){
        return this.payees;
    }
    public Constants.SplitStrategy getSplitStrategy(){
        return this.splitStrategy;
    }
    public Group getExpenseGrp(){
        return this.grp;
    }
    public User getAdmin() {
        return admin;
    }
    public User getCreator() {
        return creator;
    }
    public Float getAmt() {
        return amt;
    }
    public Group getGrp() {
        return grp;
    }

    public static class Builder{
        private Expense expense;
        public Builder(User user){
            this.expense = new Expense();
            this.expense.creator = user;
        }

        public Builder setAmt(Float amt){
            this.expense.amt=amt;
            return this;
        }

        public Builder setContributors(Map<User,Float> contribs){
            this.expense.contributors=contribs;
            return this;
        }

        public Builder setpayees(Map<User,Float> borrowers){
            this.expense.payees=borrowers;
            return this;
        }

        public Expense buildExpense(){
            return this.expense;
        } 

        
    }
}
