import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Controllers.GroupController;
import Controllers.UserController;
import Services.GroupService;
import Services.UserService;
import models.Expense;
import models.Group;
import models.User;

public class client {
    public static void main() {
        // add users
        // create grp
        // add user in grp
        // add expenses in grp
        // settle expenses

        User u1 = new User("email1@gmail.com", "manish", "9953215581");
        User u2 = new User("email2@gmail.com", "hawan", "9953215582");
        User u3 = new User("email3@gmail.com", "pawan", "9953215580");        
        ArrayList<User> users=new ArrayList<>();
        users.add(u1);
        users.add(u2);

        //u1 creates grp
        
        GroupController grpController = new GroupController();
        Group grp1 = grpController.CreatetGrp(u1);
        grp1.adduser(u3);

        //contributors
        Map<User,Float> contribs=new HashMap<User,Float>();
        contribs.put(u1,300.0f);
        contribs.put(u2,700.0f);
        Map<User,Float> receivers = new HashMap<User,Float>();
        receivers.put(u3,100f);


        //create expense
        Expense expense =  new Expense.Builder(u1).setContributors(contribs).setpayees(receivers).setAmt(1000.0f).buildExpense();
        grp1.addExpense(expense);
        //add new expense
        contribs.clear();
        receivers.clear();
        contribs.put(u1,1000.0f);
        
        receivers.put(u3,300f);
        receivers.put(u2,300f);
        Expense expense1 =  new Expense.Builder(u1).setContributors(contribs).setpayees(receivers).setAmt(1000.0f).buildExpense();
        grp1.addExpense(expense1);
        
        grpController.getgrpService().settleup(grp1);
        //groupService.settleup(grp1);
        
    }
}
