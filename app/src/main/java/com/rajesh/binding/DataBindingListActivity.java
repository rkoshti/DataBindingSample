package com.rajesh.binding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.rajesh.binding.Model.User;
import com.rajesh.binding.adapter.DataAdapter;
import com.rajesh.binding.listener.RecyclerItemClickListener;

import java.util.ArrayList;

public class DataBindingListActivity extends AppCompatActivity {

    private RecyclerView list;
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binding_list_activity);

        list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        User user1 = new User("Rajesh Koshti", 24, "http://i.imgur.com/6zgawxz.jpg");
        User user2 = new User("Ravi Chauhan", 28, "http://i.imgur.com/6zgawxz.jpg");
        User user3 = new User("Paresh Kale", 30, "http://i.imgur.com/6zgawxz.jpg");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        adapter = new DataAdapter(userList);
        list.setAdapter(adapter);

        list.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Toast.makeText(DataBindingListActivity.this, "Clicked>>" + position, Toast.LENGTH_SHORT).show();

            }
        }));

    }
}
