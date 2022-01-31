package net.uniquecomputer.sagargrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cardView,cardView1,cardView2,cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //this line for hide the action bar

        cardView = (CardView) findViewById(R.id.Mycardview);
        cardView1 = (CardView) findViewById(R.id.strawberrycard);
        cardView2 = (CardView) findViewById(R.id.cardView5);

        cardView.setOnClickListener(this);
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.Mycardview :
                i = new Intent(this,Strawberry.class);
                startActivity(i);
                break;

            case R.id.strawberrycard:
                i = new Intent(this,Strawberry.class);
                startActivity(i);
                break;

            case R.id.cardView5:
                i = new Intent(this,Strawberry.class);
                startActivity(i);
                break;
        }

    }
}