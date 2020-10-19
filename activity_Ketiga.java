package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_Ketiga extends AppCompatActivity {

    EditText username, newPassword;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        reset = findViewById(R.id.reset);
        username = findViewById(R.id.username);
        newPassword = findViewById(R.id.oldPassword);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity_Ketiga.this, "Password "+ username.getText() + " Berhasil Diubah!", Toast.LENGTH_LONG).show();
            }
        });
    }


}