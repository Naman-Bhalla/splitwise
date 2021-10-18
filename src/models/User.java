package models;

public class User extends BaseModel{
    private String emailId;
    private String name;
    private String mobNo;

    public User(String email, String name, String phNo){
        this.emailId=email;
        this.mobNo=phNo;
        this.name=name;
    }
    public String getEmail(){
        return this.emailId;
    }
    public String getName(){
        return this.name;
    }
    public String getPhNo(){
        return this.mobNo;
    }
    
}