package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.data.model;

/**
 * Created by thanhthi on 17/11/2017.
 */

public class User {

    private String mName;
    private String mPassword;

    public User() {

    }

    public User(String email, String password) {
        mName = email;
        mPassword = password;
    }

    public String getName() {
        return mName;
    }

    public void setEmail(String name) {
        mName = name;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
