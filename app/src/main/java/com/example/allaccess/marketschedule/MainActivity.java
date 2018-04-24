package com.example.allaccess.marketschedule;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String realName = "Peter";
    String realPassword = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //--------assign variables to user input
        final EditText userName = findViewById(R.id.txtUserName);
        final EditText userPassword = findViewById(R.id.txtPassword);
        final Button btnLogin = findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), Page2.class));

//----------------- Commented out the password verification so I don't have to enter every time program is run

/*                if (userName.getText().toString().equals(realName))
                {
                    if (userPassword.getText().toString().equalsIgnoreCase(realPassword)) {
                        startActivity(new Intent(getApplicationContext(), Page2.class));
                    }
                    else{
                        Toast.makeText(MainActivity.this, "incorrect password", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "unknown user", Toast.LENGTH_LONG).show();
                }
                */

            }//------ END onClick
        }); // ------- END setOnClickListener
    }// ------------ END onCreate


}
