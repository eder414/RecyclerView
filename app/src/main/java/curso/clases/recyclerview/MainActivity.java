package curso.clases.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.List;

import curso.clases.recyclerview.Adapters.RecyclerViewAdapter;
import curso.clases.recyclerview.Models.Persona;
import curso.clases.recyclerview.Utilities.Utilities;

public class MainActivity extends AppCompatActivity {
    List<Persona> lPersona;
    private LayoutInflater mInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lPersona = Utilities.GetList();
        mInflater = LayoutInflater.from(this);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(lPersona,mInflater,this);
        RecyclerView recyclerView = findViewById(R.id.recyclereView);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));

        /*añadimos adaptador a recyclerview*/
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}