package com.matheussilas.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    ImageView imgCoin;
    Button bttBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imgCoin = findViewById(R.id.ImgCoin);
        bttBack = findViewById(R.id.bttBack);


        Bundle data = getIntent().getExtras();
        int num = data.getInt("Number");

        if (num == 0){
            imgCoin.setImageResource(R.drawable.moeda_coroa);
        }else{
            imgCoin.setImageResource(R.drawable.moeda_cara);
        }


        bttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();
            }
        });



        // {"heads", "tails"};



    }
}
