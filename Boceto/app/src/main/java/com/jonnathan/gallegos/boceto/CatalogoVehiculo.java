package com.jonnathan.gallegos.boceto;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class CatalogoVehiculo extends AppCompatActivity {

    private Spinner spn;
    private ImageButton fres, papay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_vehiculo);
        Asignacion_variables();
        CargarSpinner();
        EventosButtons();
    }

    private void Asignacion_variables(){
        spn = (Spinner) findViewById(R.id.spinerview);
        fres = (ImageButton) findViewById(R.id.fresa);
        papay = (ImageButton) findViewById(R.id.papaya);


    }
    private void CargarSpinner(){
        String[] opc = {"ALL", "Faros", "Frenos"};
        ArrayAdapter <String> combo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opc);
        spn.setAdapter(combo);
    }

    private void EventosButtons(){
        fres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Esto es una prueba de un repuesto que es una fresa :)", Toast.LENGTH_LONG).show();
            }
        });
        papay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Esto es una prueba de un repuesto que es una papaya :)", Toast.LENGTH_LONG).show();
            }
        });
    }
}