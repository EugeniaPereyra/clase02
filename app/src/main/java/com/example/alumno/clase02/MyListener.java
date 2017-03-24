package com.example.alumno.clase02;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View v){
        Log.d("CLICK","se hizo click");
    }

}
