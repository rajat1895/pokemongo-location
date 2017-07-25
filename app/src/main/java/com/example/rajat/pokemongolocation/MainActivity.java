package com.example.rajat.pokemongolocation;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static Button bttn_delhi;
    private static Button bttn_ncr;
    private static Button bttn_toplocations;
    private static Button bttn_pokeinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonDelhiListner();
        onClickButtonNcrListner();
        onClickButtonTopLocationListner();
        onClickButtonPokeInfoListner();

    }


    public void onClickButtonDelhiListner(){
        bttn_toplocations=(Button)findViewById(R.id.btn);
        bttn_toplocations.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.pokemongolocation.DelhiActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickButtonNcrListner(){
        bttn_toplocations=(Button)findViewById(R.id.btn_2);
        bttn_toplocations.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.pokemongolocation.NcrActivity");
                        startActivity(intent);
                    }
                }
        );
    }


    public void onClickButtonTopLocationListner(){
        bttn_toplocations=(Button)findViewById(R.id.btn_3);
        bttn_toplocations.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.pokemongolocation.TopLocationsActivity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void onClickButtonPokeInfoListner(){
        bttn_toplocations=(Button)findViewById(R.id.btn_4);
        bttn_toplocations.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.pokemongolocation.PokeinfoActivity");
                        startActivity(intent);
                    }
                }
        );
    }




}
