package me.degunawan.latihanrcyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<Presiden> data = new ArrayList<>();

    PresidenListAdapter presidenListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        setDataPalsu();

        presidenListAdapter = new PresidenListAdapter(data, MainActivity.this);

        recyclerView.setAdapter(presidenListAdapter);




    }

    private void setDataPalsu() {
        data.add(new Presiden(
                "Soekarno",
                "Presiden Pertama",
                "18 Agustus 1945 - 12 Maret 1967",
                "https://id.wikipedia.org/wiki/Soekarno",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"));
        data.add(new Presiden(
                "Syafruddin Prawiranegara",
                "Presiden Indonesia Darurat",
                "19 Desember 1948 - 13 Juli 1949",
                "https://id.wikipedia.org/wiki/Syafruddin_Prawiranegara",
                "https://upload.wikimedia.org/wikipedia/id/c/c7/Syafruddin_Prawiranegara.jpg"));
        data.add(new Presiden(
                "Soeharto",
                "Presiden Kedua",
                "12 Maret 1967 - 21 Mei 1998",
                "https://id.wikipedia.org/wiki/Soeharto",
                "https://upload.wikimedia.org/wikipedia/commons/5/59/President_Suharto%2C_1993.jpg"));


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
}
