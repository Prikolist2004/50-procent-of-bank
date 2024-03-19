package com.example.bang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registerButton = findViewById(R.id.btn_login);
        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogFragment dialog = new DialogFragment();
                dialog.show(fragmentManager, "register_dialog");

        }
    });
    }
    public void Enter_department(View view) {


        Intent intent = new Intent(MainActivity.this, Bank_department.class);
        startActivity(intent);

    }
    public void Enter_rate(View view) {


        Intent intent = new Intent(MainActivity.this, Bank_exchange_rates.class);
        startActivity(intent);

    }

    public void Enter_log(View view) {


        Intent intent = new Intent(MainActivity.this, DialogFragment.class);
        startActivity(intent);

    }

}
