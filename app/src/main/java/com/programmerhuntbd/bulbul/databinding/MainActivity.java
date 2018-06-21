package com.programmerhuntbd.bulbul.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.programmerhuntbd.bulbul.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

       // binding.firstName.setText("Lionel");
        //binding.firstName.setText("Messi");

        player = new Player();
        binding.setPlayer(player);


    }

    public void savePlayer(View view) {
        binding.setPlayer(player);
    }
}
