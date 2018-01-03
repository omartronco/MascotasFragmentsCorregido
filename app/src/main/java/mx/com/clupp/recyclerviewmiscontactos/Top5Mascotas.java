package mx.com.clupp.recyclerviewmiscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class Top5Mascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top5_mascotas);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Adaptador adapter = new Adaptador(generaFavoritos());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    private List<ViewModel> generaFavoritos() {
        List<ViewModel> listaFavoritos = new ArrayList<>();

        listaFavoritos.add(new ViewModel("Favorito 1"));
        listaFavoritos.add(new ViewModel("Favorito 2"));
        listaFavoritos.add(new ViewModel("Favorito 3"));
        listaFavoritos.add(new ViewModel("Favorito 4"));
        listaFavoritos.add(new ViewModel("Favorito 5"));

        return listaFavoritos;
    }
}
