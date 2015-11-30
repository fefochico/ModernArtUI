package com.lab.gabriel.modernartui;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar= (SeekBar) findViewById(R.id.seekBar);
        final LinearLayout llRed= (LinearLayout) findViewById(R.id.llRed);
        //llRed.setBackgroundColor(Color.RED);
        final LinearLayout llBlue= (LinearLayout) findViewById(R.id.llBlue);
        //llBlue.setBackgroundColor(Color.BLUE);
        final LinearLayout llPurple= (LinearLayout) findViewById(R.id.llPurple);
        //llGreen.setBackgroundColor(Color.GREEN);
        final LinearLayout llWhite= (LinearLayout) findViewById(R.id.llWhite);
        //llWhite.setBackgroundColor(Color.WHITE);
        final LinearLayout llOrange= (LinearLayout) findViewById(R.id.llOrange);
        //llOrange.setBackgroundColor(Color.YELLOW);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                updateBackground(progress, llRed);
                updateBackground(progress, llBlue);
                updateBackground(progress, llPurple);
                //updateBackground(progress, llWhite);
                updateBackground(progress, llOrange);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
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
            AlertDialogFragment newDialog= new AlertDialogFragment();
            newDialog.show(getSupportFragmentManager(),"tag");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void updateBackground(int progress, LinearLayout llaux)
    {
        llaux.setAlpha((float) (1-(progress*0.01)));
    }
}
