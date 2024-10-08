package com.example.practica00;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase que gestiona las funcionalidades.
 */
public class MainActivity extends AppCompatActivity {

    // Creamos las variables de los elementos que van a tener funcionalidad
    private Button boton = null;
    private TextView texto = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // referencia al xml de la vista correspondiente
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        //---* Hasta aquí siempre igual

        // Asociamos las variables a su id en la vista
        boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
    }

    public void onClick (View v) {
        // el texto actual del TextView
        String textViewText = texto.getText().toString();
        // Texto 'Pulsa el boton' del strings.xml
        String textHola = getString(R.string.text_hola_mundo);
        // Comparamos y cambiamos
        if (textViewText.equalsIgnoreCase(textPulsa)) {
            
        }

    }
}