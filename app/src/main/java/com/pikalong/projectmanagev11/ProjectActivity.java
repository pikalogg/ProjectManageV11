package com.pikalong.projectmanagev11;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.pikalong.projectmanagev11.adapter.ProjectAdapter;
import com.pikalong.projectmanagev11.model.Project;

import java.util.ArrayList;

public class ProjectActivity extends AppCompatActivity {
    ActionBar actionBar;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        addControl();
        addEvent();
        addData();
    }

    private void addControl(){
        intent = getIntent();
        String title = intent.getStringExtra("namePro");
        actionBar = getSupportActionBar();
        actionBar.setTitle(title);
        actionBar.setDisplayHomeAsUpEnabled(true);



    }
    private void addEvent(){

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed(); //nut quay lai cua dien thoai
                return true;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private  void addData(){

    }


    //nut back dt
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ProjectActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
