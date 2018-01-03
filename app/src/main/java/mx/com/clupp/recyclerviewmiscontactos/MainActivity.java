package mx.com.clupp.recyclerviewmiscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        Adaptador adapter = new Adaptador(generateSimpleList());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.simple_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.avTop5:
                Intent intent = new Intent(MainActivity.this, Top5Mascotas.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ViewModel> generateSimpleList() {
        List<ViewModel> ViewModelList = new ArrayList<>();

        for (int i = 1; i < 51; i++) {
            ViewModelList.add(new ViewModel(String.format(Locale.US, "Mascota %d", i)));
        }

        return ViewModelList;
    }
}
