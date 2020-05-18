package com.pikalong.projectmanagev11;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RowProjectActivity extends AppCompatActivity {
    ActionBar actionBar;
    ImageView btn_op, btn_pro;
    LinearLayout btn_con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_project);
        addControl();
        addEvent();
    }
    private void addControl(){
        actionBar=getSupportActionBar();
        actionBar.hide();

        btn_op = findViewById(R.id.btn_op);
        btn_pro = findViewById(R.id.img_pro);
        btn_con = findViewById(R.id.l_con);

    }
    private void addEvent(){
        btn_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        btn_pro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                OpenPro();
//            }
//        });
//        btn_con.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                OpenPro();
//            }
//        });
    }




//    private void OpenPro(){
//        Intent intent = new Intent(RowProjectActivity.this, ProjectActivity.class);
//        startActivity(intent);
//        finish();
//
//        Log.d(WALLPAPER_SERVICE, "OpenPro: đâsd");
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
