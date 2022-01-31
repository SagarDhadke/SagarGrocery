package net.uniquecomputer.sagargrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Payment extends AppCompatActivity implements View.OnClickListener {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().hide();

        cardView = (CardView) findViewById(R.id.completeorderpayment);

        cardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.completeorderpayment:
                i = new Intent(this, Orderconfirmation.class);
                startActivity(i);
                break;

        }

    }
}