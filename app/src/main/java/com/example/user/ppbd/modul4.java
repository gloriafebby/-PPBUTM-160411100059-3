package com.example.user.ppbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class modul4 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    RecyclerView menu;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul4);
        menu= findViewById(R.id.Menu);
        //menampilkan reyclerview yang ada pada file layout dengan id reycler view

        RecyclerAdapter adapter=new RecyclerAdapter(this);
        //membuat adapter baru untuk reyclerview
        menu.setAdapter(adapter);
        //menset nilai dari adapter
        menu.setHasFixedSize(true);
        //menset setukuran
        menu.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item_about) {
            startActivity(new Intent(this, About.class));
        }
        if (id == R.id.item_logout) {
            startActivity(new Intent(this, loginempat.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Intent intent = new Intent(getApplication(), DetailMenuActivity.class);
        String pos=Integer.toString(position);
        Toast.makeText(this, pos, Toast.LENGTH_SHORT).show();
    }
}