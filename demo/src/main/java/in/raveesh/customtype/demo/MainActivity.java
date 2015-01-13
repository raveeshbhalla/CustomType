package in.raveesh.customtype.demo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;

import in.raveesh.customtype.CustomType;
import in.raveesh.customtype.TextView;


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
            setRandomTypeface();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setRandomTypeface() {
        TextView body = (TextView)findViewById(R.id.body);
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                body.setTypeface(CustomType.getTypeface(this, "fonts/RobotoCondensed/Light.ttf"));
                break;
            case 1:
                body.setTypeface(CustomType.getTypeface(this,"fonts/Roboto/LightItalic.ttf"));
                break;
            case 2:
                body.setTypeface(CustomType.getTypeface(this,"fonts/Roboto/Medium.ttf"));
                break;
        }
    }
}
