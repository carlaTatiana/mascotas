package com.example.mascotass3;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton ibMascotasFavoritas;
    ArrayList<Mascota> mascotas;
    private RecyclerView lista;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBar = (Toolbar)  findViewById(R.id.actionBarMascota);
        setSupportActionBar(actionBar);

        lista = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        lista.setLayoutManager(llm);

        //inicializo lista de mascotas
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota ("Chicho1","1", R.drawable.p1));
        mascotas.add(new Mascota ("Chicho2","2", R.drawable.p2));
        mascotas.add(new Mascota ("Chicho3","3", R.drawable.p3));
        mascotas.add(new Mascota ("Chicho4","4", R.drawable.p4));
        mascotas.add(new Mascota ("Chicho5","5", R.drawable.p5));

        //inicializo adaptador
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        lista.setAdapter(adaptador);


        ibMascotasFavoritas = (ImageButton) findViewById(R.id.ibMascotasFavoritas);
        ibMascotasFavoritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mascotasFav = new Intent(getApplicationContext(),MascotasFavoritas.class);
                startActivityForResult(mascotasFav,0);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}