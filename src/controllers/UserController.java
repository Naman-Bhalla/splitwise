package controllers;

import dto.ResponseDto;
import models.User;
import services.FirebaseUserService;
import services.IUserService;

public class UserController {
    IUserService userService = new FirebaseUserService();


    ResponseDto<User> registerUser(String username,
                                  String phoneNumber,
                                  String password) {
        return null;
    }

    User changePassword(String username,
                        String password) {
        // some actions

        String something = userService.changePassword();
        // some actions
        // return response
    }

}
