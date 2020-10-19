package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_Kedua extends AppCompatActivity {

    TextView uname, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Bundle b = getIntent().getExtras();
        uname = findViewById(R.id.uname);
        password = findViewById(R.id.password);

        uname.setText(b.getCharSequence("Uname"));
        password.setText(b.getCharSequence("Password"));
    }
}