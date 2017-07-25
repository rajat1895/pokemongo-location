package com.example.rajat.pokemongolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LodiGardenActivity extends InfoActivity {
    ListView list;
    String[] data = {
            "Pokestops=50+",
            "Gyms=3",
            "POKEMON FOUND",
            "Slowpoke(nest)",
            "Ryhorn",
            "Machop",
            "Growlithe",
            "Abra",
            "Charmandar"



    } ;
    Integer[] imageId = {
            R.drawable.pokestop,
            R.drawable.pokemongym,
            R.drawable.pikachublack,
            R.drawable.slowpoke,
            R.drawable.rhyhorn,
            R.drawable.machop,
            R.drawable.growlithe,
            R.drawable.aabra,
            R.drawable.charmandar



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodi_garden);
        getSupportActionBar().show();
        customize_listdata adapter = new
                customize_listdata(LodiGardenActivity.this,data, imageId);
        list=(ListView)findViewById(R.id.listViewlodi);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), LodiGardenActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DeerParkActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), NehruParkActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), SafdarjungTombActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), SelectCityWalkActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), SaketActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), RedFortActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), QutubMinarActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), PuranaQillaActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), CyberHubActivity.class);
                    startActivityForResult(myIntent, 0);
                }



            }
        });
    }
}

