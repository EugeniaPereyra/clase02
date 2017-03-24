package com.example.alumno.clase02;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View v){
        // Log.d("CLICK","se hizo click");

        if(v.getId()==R.id.boton1)
        {
            Log.d("CLICK","SE HIZO CLICK EN EL BOTON 1");
        }
        else
        {
            Log.d("CLICK","SE HIZO CLICK EN EL BOTON 2");
        }
    }

}
