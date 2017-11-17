package framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import framgia.openedu.nguyenthanhthi.advance2_lesson2_mvparchitect.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {

    private EditText mEdtUserName, mEdtPassword;
    private Button mButtonLogin;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Demo MVP Achitect");
        mPresenter = new LoginPresenter();

        mEdtUserName = findViewById(R.id.edt_username);
        mEdtPassword = findViewById(R.id.edt_password);
        mButtonLogin = findViewById(R.id.button_login);

        mButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = mEdtUserName.getText().toString();
        String password = mEdtPassword.getText().toString();
        mPresenter.login(username, password);
    }

    @Override
    public void showUserNameError() {
        Toast.makeText(LoginActivity.this, "Invalid Username!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPasswordError() {
        Toast.makeText(LoginActivity.this, "Invalid Password!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notifyLoginSuccess() {
        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notifyLoginFailed() {
        Toast.makeText(LoginActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
    }

}
