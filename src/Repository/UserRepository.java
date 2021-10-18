package Repository;

import java.util.ArrayList;

import models.User;

public class UserRepository implements IRepository{
    private ArrayList<User> userrepo;

    public UserRepository(ArrayList<User> users){
        this.userrepo=users;
    }

    public User registeruser(User user){
        this.userrepo.add(user);
        return this.userrepo.get(this.userrepo.size()-1);
    }

}
