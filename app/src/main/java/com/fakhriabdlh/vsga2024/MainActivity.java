package com.fakhriabdlh.vsga2024;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] nama = {
            "Indonesia",
            "Vietnam",
            "Malaysia",
            "Singapore",
            "Filipina",
            "Brunei",
            "Timor Leste",
            "Vietnam",
            "Thailand",
            "Papua Nugini",
            "Albania",
            "Inggris",
            "Perancis",
            "Australia",
            "China",
            "Saudi Arabia",
            "Mesir",
            "Sudan",
            "India",
            "Rusia",
            "Meksiko",
            "Bosnia",
            "Moroko",
            "Yordania"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1,nama);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(MainActivity.this,nama[position] + " Diklik",
                        Toast.LENGTH_LONG).show());
    }
}