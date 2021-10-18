package Controllers;

import models.Expense;
import models.Group;
import models.User;


import Controllers.DTO.Response;
import Services.UserService;

public class UserController {
    private static UserController userController=null;
    private UserService userService;

    public UserController getInstance(){
        if (userController==null){
        UserController userController=new UserController();
        //TODO
        // is this way correct to create service?? we dont need constructor function this way
        this.userController.userService = new UserService(); 

        }
        return userController;
    }
    public Group createGrp(User user){
        return userController.userService.createGrp(user);
    }
    public Response letsSettle(User user, Group grp){
        Boolean status = userController.userService.isMemberofGroup(user,grp);
        if (status) {
            userController.userService.askToSettle(user, grp);
            return new Response(status,"Settled","200");
        }
        return  new Response(status,"user not part of Group","400");
    }
    public Response addExpense(Group grp,Expense expense){
        userController.userService.addExpense(grp, expense);
        
        //update the net balance for users in the group. this will help in faster settling up
        grp.setmembersNetBal(userService.updUserNetBal(expense, grp));
        //TODO
        //shall I call grp method as abv or it shall be thru some service??

        return new Response(true, "expense added", "200");
    }


}
