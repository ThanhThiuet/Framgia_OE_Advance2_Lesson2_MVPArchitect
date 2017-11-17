package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.screen;

import framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data.LoginRepository;

/**
 * Created by thanhthi on 17/11/2017.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginRepository mRepository;
    private LoginContract.View mView;


    public LoginPresenter() {
        mRepository = new LoginRepository();
        mView = new LoginActivity();
    }

    public LoginContract.View getView() {
        return mView;
    }

    public void setView(LoginContract.View view) {
        mView = view;
    }

    @Override
    public void login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            mView.notifyLoginSuccess();
        } else if(mRepository.haveUsernameTruePassFalse(username, password)) {
            mView.showPasswordError();
        } else if (mRepository.havePassTrueUsernameFalse(username, password)) {
            mView.showUserNameError();
        } else {
            mView.notifyLoginFailed();
        }
    }

    @Override
    public boolean isLoginSuccess(String username, String password) {
        return mRepository.isLoginSuccess(username, password);
    }
}
