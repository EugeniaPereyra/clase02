package com.example.alumno.clase02;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        TextView tv = (TextView) super.findViewById(R.id.tvSaludo); // super es que hereda del padre
        tv.setText("holaaaaaaaaaa");

        // LISTENERS

        Button boton1 = (Button) super.findViewById(R.id.boton1);
        boton1.setText("Cambiar texto");
        View.OnClickListener listener = new MyListener();
        boton1.setOnClickListener(listener);

        Button boton2 = (Button) super.findViewById(R.id.boton2);
        boton2.setText("Otro cambio de texto");
        boton2.setOnClickListener(listener);

    }
}
