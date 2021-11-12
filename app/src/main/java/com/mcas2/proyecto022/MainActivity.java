package com.mcas2.proyecto022;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button boton;
    public ImageView imagen;
    public boolean itIsVisible = false;
    public TextView contador;
    public int conteo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton);
        imagen = (ImageView) findViewById(R.id.imagen);
        contador = (TextView) findViewById(R.id.contador);

        boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itIsVisible == false) {
                        imagen.setVisibility(View.VISIBLE);
                        itIsVisible = true;
                    } else {
                        imagen.setVisibility(View.INVISIBLE);
                        itIsVisible = false;
                }
                    conteo += 1;
                    contador.setText(String.valueOf(conteo));
            }
        });
    }
}