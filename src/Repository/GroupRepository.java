package Repository;

import java.util.ArrayList;

import models.Group;
import models.User;



public class GroupRepository implements IRepository {
    private ArrayList<Group> grpsRepo;
    private static GroupRepository groupRepo=null;

    public GroupRepository getInstance(){
        if (grpsRepo==null){
            GroupRepository groupRepo = new GroupRepository();
            groupRepo.grpsRepo = new ArrayList<Group>();
        }
        return groupRepo;
    }    

    public Group addGroup(Group grp){
        this.grpsRepo.add(grp);
        return this.grpsRepo.get(this.grpsRepo.size()-1);
    }    

    public Group CreateGroup(User user){
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        Group grp = new Group(users);
        
        return grp;
        
    }

}
