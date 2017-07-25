package com.example.rajat.pokemongolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class NcrActivity extends InfoActivity {

    ListView list;
    String[] toplocs = {

            "Gurgaon",
            "Ghaziabad",
            "Noida",
            "Faridabad"

    } ;
    Integer[] imageId = {

            R.drawable.cyberhubgurgaon,
            R.drawable.deerpark,
            R.drawable.nehrupark,
            R.drawable.safdarjungtomb


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncr);
        getSupportActionBar().show();
        customize_list adapter = new
                customize_list(NcrActivity.this,toplocs, imageId);
        list=(ListView)findViewById(R.id.listViewNcr);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), GurgaonActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), GhaziabadActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), NoidaActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), FaridabadActivity.class);
                    startActivityForResult(myIntent, 0);
                }




            }
        });
    }
}
