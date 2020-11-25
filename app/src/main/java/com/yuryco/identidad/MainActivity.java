package com.yuryco.identidad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar =  findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        rvMascotas = findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicilizarAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mPreferidos:
                Intent i = new Intent(this,MascotasFavoritas.class);
                startActivity(i);
            case R.id.mAbout:
                break;
            case R.id.mSettings:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void inicilizarAdaptador() {
        MascotaAdaptador adaptador  = new MascotaAdaptador(mascotas,this);
        rvMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        mascotas =new ArrayList<Mascota>();
        mascotas.add(new Mascota( "Catty ",3, true, R.drawable.mascota1));
        mascotas.add(new Mascota("Axl", 2 ,true, R.drawable.mascota2));
        mascotas.add(new Mascota("Firulais", 1, false, R.drawable.mascota3));
        mascotas.add(new Mascota("Max", 4, true, R.drawable.mascota4));
        mascotas.add(new Mascota("Ronny", 2, true, R.drawable.mascota5));
    }
}