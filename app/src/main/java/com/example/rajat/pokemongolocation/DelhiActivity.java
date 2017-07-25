package com.example.rajat.pokemongolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DelhiActivity extends InfoActivity {

    ListView list;
    String[] toplocs = {
            "Lodi Garden (Jorbagh)",
            "Deer Park (Hauz Khas)",
            "Nehru Park (Chanakyapuri)",
            "Safdarjung Tomb",
            "Select City Walk (Malviya Nagar)",
            "Red Fort",
            "Qutub Minar",
            "Purana Qilla",
            "IGNOU(neb sarai)",
            "Maidan Garhi",
            "Sanik Farms",
            "RK Puram",
            "Munirka",
            "Malviya Nagar",
            "J-Block(Saket)",
            "Satya Niketan",
            "Sarojni Nagar Market",
            "Hauz Khas Village",
            "Adchini",
            "Saket Metro",
            "Ina Metro",
            "Malviya Nagar Metro",
            "Jorbagh Metro",
            "Lodi Garden"


    } ;
    Integer[] imageId = {
            R.drawable.image,
            R.drawable.deerpark,
            R.drawable.nehrupark,
            R.drawable.safdarjungtomb,
            R.drawable.selectcitywalk,
            R.drawable.redfort,
            R.drawable.qutubminar,
            R.drawable.puranaqilla,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon,
            R.drawable.cyberhubgurgaon





    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        getSupportActionBar().show();
        customize_list adapter = new
                customize_list(DelhiActivity.this,toplocs, imageId);
        list=(ListView)findViewById(R.id.listViewdelhi);
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



            }
        });
    }
}
