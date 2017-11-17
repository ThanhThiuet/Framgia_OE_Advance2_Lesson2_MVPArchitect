package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data;

import framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data.model.User;

/**
 * Created by thanhthi on 17/11/2017.
 */

public class LoginRepository {

    private LoginLocalRepository mLocalRepo;

    public LoginRepository() {
        mLocalRepo = new LoginLocalRepository();
    }

    public boolean isLoginSuccess(String name, String password) {
        return mLocalRepo.isLoginSuccess(new User(name, password));
    }

    public boolean haveUsernameTruePassFalse(String name, String password) {
        return mLocalRepo.haveUsernameTruePassFalse(new User(name, password));
    }

    public boolean havePassTrueUsernameFalse(String name, String password) {
        return mLocalRepo.havePassTrueUsernameFalse(new User(name, password));
    }
}
