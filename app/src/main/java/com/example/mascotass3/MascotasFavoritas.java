package com.example.mascotass3;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView lista;
    ImageButton ibVolverActionBar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);


        Toolbar miActionBar = (Toolbar)  findViewById(R.id.actionBarMascota);
        setSupportActionBar(miActionBar);

        lista = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        lista.setLayoutManager(llm);

        //inicializo lista de mascotas
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota ("Chicho4","2", R.drawable.p3));
        mascotas.add(new Mascota ("Chicho3","3", R.drawable.p1));
        mascotas.add(new Mascota ("Chicho2","1", R.drawable.p2));
        mascotas.add(new Mascota ("Chicho5","5", R.drawable.p4));
        mascotas.add(new Mascota ("Chicho1","2", R.drawable.p5));

        //inicializo el adaptador
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        lista.setAdapter(adaptador);

        ibVolverActionBar = (ImageButton) findViewById(R.id.ibVolverActionBar);
        ibVolverActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(home,0);
            }
        });
    }

}
