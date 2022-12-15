package es.ucm.fdi.takeorder_tfg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button botton_add;

    BottomNavigationView menuBottonNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botton_add = findViewById(R.id.)

        //lo instanciamos
        menuBottonNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        menuBottonNavigation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
               //necesitamos cual de las opciones el usuario esta seleccionando
                if(item.getItemId() == R.id.menu_reserva_mesas){

                }

                if(item.getItemId() == R.id.menu_carta_platos){

                }
                //return true;
            }
        });
    }
}