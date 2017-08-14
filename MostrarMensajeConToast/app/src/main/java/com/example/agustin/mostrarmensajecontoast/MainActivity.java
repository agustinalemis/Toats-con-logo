package com.example.agustin.mostrarmensajecontoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    String semana[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(this);
        semana=getResources().getStringArray(R.array.Semana);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s = semana[position];
        Toast.makeText(this,"Usted eligio: "+s, Toast.LENGTH_SHORT).show();
    }
}
