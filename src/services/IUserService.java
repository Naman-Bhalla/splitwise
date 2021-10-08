package services;

import models.User;
import repositories.ExpenseRepository;
import repositories.UserRepository;

public interface IUserService {
    UserRepository userRepository;
    ExpenseRepository expenseRepository;

    User changePassword(String username,
                        String password) {
        userRepository.updatePasswordWhereUsernameEquals(username, password);

    }


    // controller is like the door
    // RESTCOntroller
    // CommandLineController


}
