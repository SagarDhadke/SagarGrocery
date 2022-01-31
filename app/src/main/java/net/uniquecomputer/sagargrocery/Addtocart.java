package net.uniquecomputer.sagargrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Addtocart extends AppCompatActivity implements View.OnClickListener {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocart);
        getSupportActionBar().hide();

        cardView = (CardView) findViewById(R.id.continuetopaymentbtn);

        cardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.continuetopaymentbtn:
                i = new Intent(this, Payment.class);
                startActivity(i);
                break;

        }

    }
}