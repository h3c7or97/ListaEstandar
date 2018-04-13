package com.hector.listaestandar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
public List<Item> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvlista =(ListView) findViewById(R.id.lvLista);
        Lista = new ArrayList<>();
        //Lista.add("Sergio");
        //Lista.add("Francisco");
        //Lista.add("Hector");
        //Lista.add("Alejandro");
        //Lista.add("Anabell");
        //Lista.add("Mario");
        //Lista.add("Orlando");
        //Lista.add("Joaquin");
        //Lista.add("Cristian");
        //Lista.add("Erick");
        //Lista.add("Orlando");
        //Lista.add("Marcos");


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,Lista);
        lvlista.setAdapter(arrayAdapter);

        lvlista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this, Lista.get(position), Toast.LENGTH_SHORT).show();
    }

    public  void onClick(View v){
        EditText etNombre =(EditText) findViewById(R.id.etNombre);
        EditText etApellido =(EditText) findViewById(R.id.etApellido);
        EditText etCarrera =(EditText) findViewById(R.id.etCarrera);
        Item item = new Item(etNombre.getText().toString(),etApellido.getText().toString(), etCarrera.getText().toString());
        Lista.add(item);
        ListView lvLista =(ListView) findViewById(R.id.lvLista);
        ArrayAdapter arrayAdapter =(ArrayAdapter) lvLista.getAdapter();
        arrayAdapter.notifyDataSetChanged();
    }
}
