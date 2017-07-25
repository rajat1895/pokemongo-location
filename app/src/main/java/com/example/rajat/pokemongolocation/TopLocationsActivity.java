package com.example.rajat.pokemongolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TopLocationsActivity extends InfoActivity {

    ListView list;
    String[] toplocs = {
            "Lodi Garden (Jorbagh)",
            "Deer Park (Hauz Khas)",
            "Nehru Park (Chanakyapuri)",
            "Safdarjung Tomb",
            "Select City Walk (Malviya Nagar)",
            "PVR(Saket)",
            "Red Fort",
            "Qutub Minar",
            "Purana Qilla",
            "Cyber Hub(Gurgaon)",

    } ;
    Integer[] imageId = {
            R.drawable.image,
            R.drawable.deerpark,
            R.drawable.nehrupark,
            R.drawable.safdarjungtomb,
            R.drawable.selectcitywalk,
            R.drawable.pvrsaket,
            R.drawable.redfort,
            R.drawable.qutubminar,
            R.drawable.puranaqilla,
            R.drawable.cyberhubgurgaon

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_locations);
        getSupportActionBar().show();
        customize_list adapter = new
                customize_list(TopLocationsActivity.this,toplocs, imageId);
        list=(ListView)findViewById(R.id.listViewTopLoc);
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




