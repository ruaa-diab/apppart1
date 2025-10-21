package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.dataAccessLayer.Movie;
import com.example.myapplication.dataAccessLayer.itemsDAmockups;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lista=findViewById(R.id.lista);
        itemsDAmockups d=new itemsDAmockups();
        List<Movie> movies=d.getAllMovies();
        ArrayAdapter<Movie> adapter=new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,movies);
        lista.setAdapter(adapter);

    }
}