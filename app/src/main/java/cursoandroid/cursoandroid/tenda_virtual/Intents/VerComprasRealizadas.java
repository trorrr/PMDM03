package cursoandroid.cursoandroid.tenda_virtual.Intents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import cursoandroid.cursoandroid.tenda_virtual.R;
import cursoandroid.cursoandroid.tenda_virtual.RecycleViewAdapter_RecycleViewCardView;

public class VerComprasRealizadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String Usuario = intent.getExtras().getString("Usuario");
        setContentView(R.layout.activity_ver_compras_realizadas);

        RecycleViewAdapter_RecycleViewCardView recycleAdapter = new RecycleViewAdapter_RecycleViewCardView(getApplicationContext(), Usuario,"Aceptada");

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);

        RecyclerView recyclerView = findViewById(R.id.rvwRecycleView);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(recycleAdapter);
    }
}
