package com.example.alkewallet;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        Button profileButton = findViewById(R.id.goToProfile);

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);

            });
        Button sendButton = findViewById(R.id.goToSendMoney);

        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, SendMoneyActivity.class);
            startActivity(intent);
        });
        Button requestButton = findViewById(R.id.goToRequestMoney);

        requestButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, RequestMoneyActivity.class);
            startActivity(intent);
        });

    }
}