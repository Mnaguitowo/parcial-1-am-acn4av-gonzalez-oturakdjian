package com.example.parcial_1_pm_acn4av_gonzales_oturakdjian;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull android.view.MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Toast.makeText(MainActivity.this, "Inicio", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_offers:
                        Toast.makeText(MainActivity.this, "Ofertas", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_cart:
                        Toast.makeText(MainActivity.this, "Carrito", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_box:
                        Toast.makeText(MainActivity.this, "Pedidos", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.nav_menu:
                        Toast.makeText(MainActivity.this, "Más", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });


    }
}