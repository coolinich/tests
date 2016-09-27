package tests.applogic;

import tests.model.User;

/**
 * Created by Olga on 9/24/2016.
 */
public interface UserHelper {
    void loginAs(User user);
    void logout();
    boolean isLoggedIn();
    boolean isLoggedInAs(User user);
    boolean isNotLoggedIn();
}
