package ders.yasin.layouttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LinearActivity extends AppCompatActivity {
    EditText etUserName,etPassword;
    Button btnLogin;
    String trueUN="yasin";
    String truePass="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        etPassword=findViewById(R.id.et_Password);
        etUserName=findViewById(R.id.et_UserName);
        btnLogin=findViewById(R.id.btn_Login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=etUserName.getText().toString();
                String password=etPassword.getText().toString();
                if(!TextUtils.isEmpty(userName)&& !TextUtils.isEmpty(password)){
                    if(userName.equals(trueUN))
                        if(password.equals(truePass))
                            Toast.makeText(getApplicationContext(),"You have succcessfully logined in",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(getApplicationContext(),"UserName or Password was not entered",Toast.LENGTH_SHORT).show();
            }
        });
    }
}