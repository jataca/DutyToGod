package com.example.jcasperson.dutytogod;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // main pages
    public void deaconMain(View view){
        setContentView(R.layout.deacon_main);
    }

    public void teacherMain(View view){
        setContentView(R.layout.deacon_main);
    }
    public void priestMain(View view){
        setContentView(R.layout.deacon_main);
    }

    // secondary deacon pages
    public void deaconSS(View view){
        setContentView(R.layout.deacon_ss);
    }

    public void deaconPD(View view){
        setContentView(R.layout.deacon_pd);
    }

    public void deaconFTSY(View view){
        setContentView(R.layout.deacon_ftsy);
    }

    // deacon SS pages
    public void deaconSSPrayLearn(View view){
        setContentView(R.layout.deacon_ss_pray_learn);
    }
    public void deaconSSPrayAct(View view){
        setContentView(R.layout.deacon_ss_pray_act);
    }
    public void deaconSSPrayShare(View view){
        setContentView(R.layout.deacon_ss_pray_share);
    }

    public void deaconSSLiveLearn(View view){
        setContentView(R.layout.deacon_ss_live_learn);
    }
    public void deaconSSLiveAct(View view){
        setContentView(R.layout.deacon_ss_live_act);
    }
    public void deaconSSLiveShare(View view){
        setContentView(R.layout.deacon_ss_live_share);
    }

    public void deaconSSUnderstandLearn(View view){setContentView(R.layout.deacon_ss_understand_learn); }
    public void deaconSSUnderstandAct(View view){setContentView(R.layout.deacon_ss_understand_act);}
    public void deaconSSUnderstandShare(View view){setContentView(R.layout.deacon_ss_understand_share); }







}
