package com.pikalong.projectmanagev11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.pikalong.projectmanagev11.adapter.ProjectAdapter;
import com.pikalong.projectmanagev11.model.Project;

import java.util.ArrayList;
import java.util.List;

import static com.pikalong.projectmanagev11.R.string.open;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ActionBar actionBar;
    TextView btn_dang, btn_da;
    ListView listView;
    LinearLayout l_tmp;
    ImageButton btn_add;
    DrawerLayout drawer;
    ActionBarDrawerToggle drawerToggle;

    

    List<Project> projects_dang;
    List<Project> projects_da;
    ProjectAdapter projectAdapter_dang;
    ProjectAdapter projectAdapter_da;

    boolean inDang = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);
        addControl();
        addEvent();
        addData();
    }

    private void addControl(){
        actionBar = getSupportActionBar();
        actionBar.setTitle("Pika Team");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_option_n);


        btn_da = findViewById(R.id.btn_da);
        btn_dang = findViewById(R.id.btn_dang);
        listView = findViewById(R.id.listview);
        l_tmp = findViewById(R.id.l_tmp);

        btn_add = findViewById(R.id.btn_add);
        drawer = findViewById(R.id.drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawer, open, R.string.close);
        drawer.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }
    private void addEvent(){
        btn_da.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                listView.setAdapter(projectAdapter_da);
                l_tmp.setGravity(Gravity.RIGHT);
                inDang = false;
            }
        });
        btn_dang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                listView.setAdapter(projectAdapter_dang);
                l_tmp.setGravity(Gravity.LEFT);
                inDang = true;
                Log.d(WALLPAPER_SERVICE, "onClick: da hoan thanh");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, AddProjectActivity.class);
                startActivity(intent);
//                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                if(drawerToggle.onOptionsItemSelected(item))
                    return true;
            case R.id.action_file:

                return  true;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private  void addData(){
        projects_dang = new ArrayList<>();
        projects_dang.add(new Project("Dự án 1", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 2", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 3", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 4", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 5", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 6", "chả cần làm gì"));
        projects_dang.add(new Project("Dự án 7", "chả cần làm gì"));

        projects_da = new ArrayList<>();
        projects_da.add(new Project("Dự án xong 1", "chả cần làm gì"));
        projects_da.add(new Project("Dự án xong 2", "chả cần làm gì"));

        projectAdapter_dang = new ProjectAdapter(projects_dang , getApplicationContext());
        projectAdapter_da = new ProjectAdapter(projects_da , getApplicationContext());
        listView.setAdapter(projectAdapter_dang);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DashboardActivity.this, ProjectActivity.class);
                if(inDang){
                    intent.putExtra("namePro", projects_dang.get(i).getTitle());
                } else {
                    intent.putExtra("namePro", projects_da.get(i).getTitle());
                }
                startActivity(intent);
//                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item_pi1: {
                Toast.makeText(this,"pika", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
