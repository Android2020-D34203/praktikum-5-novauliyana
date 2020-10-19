package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login, forgotpasswod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password= findViewById(R.id.password);
        login = findViewById(R.id.buttonLogin);
        forgotpasswod = findViewById(R.id.buttonPassword);
    }

    public void login(View view){
        Intent intent = new Intent(MainActivity.this, activity_Kedua.class);
        Bundle b = new Bundle();

        b.putString("Uname", username.getText().toString());
        b.putString("Password", password.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }

    public void forgotPassword(View v){
        Intent intent = new Intent(MainActivity.this, activity_Ketiga.class);
        Bundle b = new Bundle();

        b.putString("Password", password.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
}