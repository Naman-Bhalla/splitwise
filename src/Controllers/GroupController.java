package Controllers;

import Services.GroupService;
import models.*;

public class GroupController {
    private static GroupController grpController=null;
    private GroupService grpService;
    public static GroupController getInstance(){
        if (grpController==null){
            grpController=new GroupController();
            grpController.grpService = new GroupService();
        }
        return grpController;
    }
    
    public Group CreatetGrp(User user){
        Group grp=grpController.grpService.createGrp(user);
        return grp;
    }
    public GroupService getgrpService(){
        return grpController.grpService;
    }

}
