package bsse.asu.edu.ser423sambuddhanathandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

import bsse.asu.edu.eduasubsse1219597327ser423sambuddhanathandroid.R;
import bsse.asu.edu.ser423sambuddhanathandroid.models.PlaceDescriptionPOJO;

public class MainActivity extends AppCompatActivity {

    public PlaceLibrary placeLibrary;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeLibrary = new PlaceLibrary(this);
        HashMap<String, PlaceDescriptionPOJO> placeDescriptionPOJOHashTable = placeLibrary.getPlaceDescriptionPOJOHashMap();

        String temp = "Hi";
        btn = (Button) findViewById(R.id.my_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myButtonOnClick();
            }
        });
    }

    public void myButtonOnClick() {
        Intent i = new Intent(this, PlaceDescriptionActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(this.getClass().getSimpleName(), "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(this.getClass().getSimpleName(), "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(this.getClass().getSimpleName(), "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(this.getClass().getSimpleName(), "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(this.getClass().getSimpleName(), "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(this.getClass().getSimpleName(), "onDestroy");
    }
}
