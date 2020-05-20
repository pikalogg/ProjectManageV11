package com.pikalong.projectmanagev11;

        import androidx.appcompat.app.ActionBar;
        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.Switch;
        import android.widget.TextView;

        import com.pikalong.projectmanagev11.adapter.ProjectAdapter;
        import com.pikalong.projectmanagev11.adapter.TaskAdapter;
        import com.pikalong.projectmanagev11.model.Project;
        import com.pikalong.projectmanagev11.model.Task;

        import java.util.ArrayList;
        import java.util.List;

public class ProjectActivity extends AppCompatActivity {
    ActionBar actionBar;
    Intent intent;

    int in = 0;
    ListView listView;
    TextView btn_gv, btn_dl, btn_kt, btn_ht;
    LinearLayout l_tmp, l_tmp2;


    List<Task> tasks_gv;
    List<Task> tasks_dl;
    List<Task> tasks_kt;
    List<Task> tasks_ht;
    TaskAdapter taskAdapter_gv;
    TaskAdapter taskAdapter_dl;
    TaskAdapter taskAdapter_kt;
    TaskAdapter taskAdapter_ht;

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

        listView = findViewById(R.id.lv_conten);
        btn_gv = findViewById(R.id.btn_giaoviec);
        btn_dl = findViewById(R.id.btn_danglam);
        btn_kt = findViewById(R.id.btn_kiemtra);
        btn_ht = findViewById(R.id.btn_hoanthanh);

        l_tmp = findViewById(R.id.l_tmp);
        l_tmp2 = findViewById(R.id.l_tmp2);

    }
    private void addEvent(){
        btn_gv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(taskAdapter_gv);
                l_tmp.setGravity(Gravity.LEFT);
                l_tmp2.setGravity(Gravity.LEFT);
                in = 0;
            }
        });
        btn_dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(taskAdapter_dl);
                l_tmp.setGravity(Gravity.LEFT);
                l_tmp2.setGravity(Gravity.RIGHT);
                in = 1;
            }
        });
        btn_kt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(taskAdapter_kt);
                l_tmp.setGravity(Gravity.RIGHT);
                l_tmp2.setGravity(Gravity.LEFT);
                in = 2;
            }
        });
        btn_ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listView.setAdapter(taskAdapter_ht);
                l_tmp.setGravity(Gravity.RIGHT);
                l_tmp2.setGravity(Gravity.RIGHT);
                in = 3;
            }
        });
    }

    private  void addData(){
        tasks_gv = new ArrayList<>();
        tasks_gv.add(new Task("công việc cao cả", "đứng im một chỗ"));
        tasks_gv.add(new Task("công việc bần hàn", "đi qua đi lại"));
        tasks_gv.add(new Task());

        tasks_dl = new ArrayList<>();
        tasks_dl.add(new Task());

        tasks_kt = new ArrayList<>();
        tasks_kt.add(new Task("Cái này cần kiểm tra nha", "Biểu mẫu trên đây mang tính tham khảo, quý khách hàng nên tham khảo ý kiến tư vấn của luật sư hoặc tìm hiểu thêm quy định pháp luật tại thời điểm áp dụng, Nếu còn vướng mắc"));

        tasks_ht = new ArrayList<>();

        taskAdapter_gv = new TaskAdapter(tasks_gv, getApplicationContext());
        taskAdapter_dl = new TaskAdapter(tasks_dl, getApplicationContext());
        taskAdapter_kt = new TaskAdapter(tasks_kt, getApplicationContext());
        taskAdapter_ht = new TaskAdapter(tasks_ht, getApplicationContext());

        listView.setAdapter(taskAdapter_gv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (in){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pro, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id){
            case android.R.id.home:
                onBackPressed(); //nut quay lai cua dien thoai
                return true;
            case R.id.action_delete:

                return true;
            case R.id.action_return:

                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //nut back dt
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent intent = new Intent(ProjectActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();
    }
}
