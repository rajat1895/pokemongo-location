package com.example.rajat.pokemongolocation;

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

public class InfoActivity extends AppCompatActivity {
    private static Button bttn_submitinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ActionBar ab=getSupportActionBar();
        ab.setLogo(R.drawable.pokeball);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.info_id)
        {
            Intent infoAct = new Intent(this, InfoActivity.class);
            //Start Contact Intent
            startActivity(infoAct);
            return true;
        }
        else if(id== R.id.submit_id){

            Intent submit = new Intent(this, SubmitInfoActivity.class);
            //Start Contact Intent
            startActivity(submit);
            return true;}
        else if (id==  R.id.contact_id) {
            Intent ContactIntent = new Intent(this, ContatctUsActivity.class);
            //Start Contact Intent
            startActivity(ContactIntent);
            return true;
        }


        else if(id==R.id.home){
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }



        return super.onOptionsItemSelected(item);


    }
    public void onClickButtonSubmitInfo(){
       bttn_submitinfo=(Button)findViewById(R.id.bttn_submitpokeinfo);
        bttn_submitinfo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Submitintent=new Intent("com.example.rajat.pokemongolocation.SubmitInfoActivity");
                        startActivity(Submitintent);
                    }
                }
        );
    }

}
