package com.pikalong.projectmanagev11;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class RowProjectActivity extends AppCompatActivity {
    ActionBar actionBar;
    ImageView btn_op;
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

    }
    private void addEvent(){
        btn_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
