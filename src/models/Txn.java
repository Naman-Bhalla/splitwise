package models;

public class Txn extends BaseModel {
    private User payer;
    private User receiver;
    private Group grp;
    private Float amt;
    public Txn(User payer,User receiver,Group grp,Float amount){
        this.payer=payer;
        this.receiver=receiver;
        this.grp=grp;
        this.amt=amount;
    }
    public Float getTxnAmt(){
        return this.amt; 
    }
    public User getPayer(){
        return this.payer;
    }
    public User getReceiver(){
        return this.receiver;
    }
    public Group getGrp(){
        return this.grp;
    }
    
}
