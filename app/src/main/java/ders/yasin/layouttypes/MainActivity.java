package ders.yasin.layouttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Freezable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLinear,btnRelative,btnFrame,btnTable,btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLinear=findViewById(R.id.btn_Linear);
        btnRelative=findViewById(R.id.btn_Relative);
        btnFrame=findViewById(R.id.btn_Frame);
        btnTable=findViewById(R.id.btn_Table);
        btnGrid=findViewById(R.id.btn_Grid);
        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int ID=view.getId();
        Intent i;
        switch (ID){
            case R.id.btn_Linear:
                i=new Intent(MainActivity.this,LinearActivity.class);
                startActivity(i);
                break;
            case R.id.btn_Relative:
                i=new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(i);
                break;
            case R.id.btn_Frame:
                i=new Intent(MainActivity.this, FrameActivity.class);
                startActivity(i);
                break;
            case R.id.btn_Table:
                i=new Intent(MainActivity.this,TableActivity.class);
                startActivity(i);
                break;
            case R.id.btn_Grid:
                i=new Intent(MainActivity.this, GridActivity.class);
                startActivity(i);

        }
    }
}