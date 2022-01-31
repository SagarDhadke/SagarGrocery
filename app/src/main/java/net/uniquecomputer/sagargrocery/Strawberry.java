package net.uniquecomputer.sagargrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Strawberry extends AppCompatActivity implements View.OnClickListener {

    public CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strawberry);
        getSupportActionBar().hide();

        cardView = (CardView) findViewById(R.id.checkoutcard);

        cardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.checkoutcard:
                i = new Intent(this, Addtocart.class);
                startActivity(i);
                break;

        }
    }
}