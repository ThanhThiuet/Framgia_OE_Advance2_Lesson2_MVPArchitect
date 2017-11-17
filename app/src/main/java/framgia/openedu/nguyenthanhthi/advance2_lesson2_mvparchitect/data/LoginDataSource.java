package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data;

import framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data.model.User;

/**
 * Created by thanhthi on 17/11/2017.
 */

public interface LoginDataSource {

    boolean isLoginSuccess(User user);

    boolean haveUsernameTruePassFalse(User user);

    boolean havePassTrueUsernameFalse(User user);
}
