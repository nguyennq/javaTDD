package vn.nguyen.service;

import vn.nguyen.Model.User;

/**
 * Created by nals on 2/7/18.
 */
public interface UserDAO {
    void updateUser(UserService userService);
    User findById(String userId);

}
