package com.example.eventhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TheWishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_wishlist);
    }

    public void  startnextActivity1(View view) {
        Intent intent1 = new Intent(TheWishlist.this,MainActivityOrderTickets.class);
        startActivity(intent1);
    }
}
