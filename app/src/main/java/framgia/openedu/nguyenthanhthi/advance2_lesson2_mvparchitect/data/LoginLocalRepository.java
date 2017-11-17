package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data;

import framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data.model.User;

/**
 * Created by thanhthi on 17/11/2017.
 */

public class LoginLocalRepository implements LoginDataSource {

    private User[] mUsers = {
            new User("admin", "1234"),
            new User("test", "1"),
            new User("1", "1")
    };

    public LoginLocalRepository() {
    }

    public LoginLocalRepository(User[] users) {
        mUsers = users;
    }

    public User[] getAllUsers() {
        return mUsers;
    }

    public void setUsers(User[] users) {

        this.mUsers = users;
    }

    @Override
    public boolean isLoginSuccess(User user) {
        for (User tempUser : mUsers) {
            if (user.getName().equals(tempUser.getName())
                    && user.getPassword().equals(tempUser.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean haveUsernameTruePassFalse(User user) {
        if (isLoginSuccess(user)) return false;
        for (User tempUser : mUsers) {
            if (user.getName().equals(tempUser.getName())
                    && !user.getPassword().equals(tempUser.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean havePassTrueUsernameFalse(User user) {
        if (isLoginSuccess(user)) return false;
        for (User tempUser : mUsers) {
            if (!user.getName().equals(tempUser.getName())
                    && user.getPassword().equals(tempUser.getPassword())) {
                return true;
            }
        }
        return false;
    }


}
