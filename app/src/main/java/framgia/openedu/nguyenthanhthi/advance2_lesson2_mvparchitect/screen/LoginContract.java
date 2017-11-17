package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.screen;

/**
 * Created by thanhthi on 17/11/2017.
 */

public interface LoginContract {

    /**
     * View
     */
    interface View {

        void showUserNameError();

        void showPasswordError();

        void notifyLoginSuccess();

        void notifyLoginFailed();
    }

    /**
     * Presenter
     */
    interface Presenter {

        void login(String username, String password);

        boolean isLoginSuccess(String username, String password);
    }
}
