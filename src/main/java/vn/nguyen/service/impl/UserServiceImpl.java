package vn.nguyen.service.impl;

import vn.nguyen.Model.User;
import vn.nguyen.service.SecurityService;
import vn.nguyen.service.UserDAO;
import vn.nguyen.service.UserService;

/**
 * Created by nals on 2/7/18.
 */
public class UserServiceImpl implements UserService, UserDAO, SecurityService{
    private UserService userService;
    private UserDAO userDAO;
    private SecurityService securityService;
    User user = new User("abc", "123");

    public UserServiceImpl(UserService userService, UserDAO userDAO, SecurityService securityService) {
        this.userService = userService;
        this.userDAO = userDAO;
        this.securityService = securityService;
    }

    @Override
    public String getPasswordService() {
//        User user = new User("abc","123");
        return user.getPassword();
    }

    @Override
    public void setPasswordService(String passwordMD5) {
        user.setPassword(passwordMD5);
    }

    @Override
    public void updateUser(UserService userService) {
//        user.setPassword(userService.setPasswordService(););
    }

    @Override
    public String md5(String password) {
        return "md5";
    }

    public void assignPassword(UserService userService) throws Exception {
        String passwordMd5 = securityService.md5(userService.getPasswordService());
        userService.setPasswordService(passwordMd5);
        userDAO.updateUser(userService);
    }

//    public UserServiceImpl(UserDAO dao, SecurityService security) {
//        this.userDAO = dao;
//        this.securityService = security;
//    }
}
