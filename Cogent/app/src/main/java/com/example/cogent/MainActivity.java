package com.example.cogent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView,toprecycler,musttryrecycler;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);






        recyclerView = findViewById(R.id.recycler_special_events);
        toprecycler = findViewById(R.id.recycler_top_scroll);
        int[] images = {R.drawable.img_1,R.drawable.img_2,R.drawable.img_5,R.drawable.img_4,R.drawable.img_6};
        toprecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        TopAdapter topAdapter = new TopAdapter(images,this);
        toprecycler.setAdapter(topAdapter);
        toprecycler.scrollToPosition(2);

        ArrayList<SpecialModel> list = new ArrayList<>();
        list.add(new SpecialModel(R.drawable.img_1,"Rs 5,00,000","Rs 30","ENG vs IND"));
        list.add(new SpecialModel(R.drawable.img_4,"Rs 2,00,000","Rs 20","AUS vs PAK"));
        list.add(new SpecialModel(R.drawable.img_2,"Rs 1,00,000","Rs 50","NZ vs RSA"));
        list.add(new SpecialModel(R.drawable.img_3,"Rs 7,00,000","Rs 100","KKR vs PBKS"));
        list.add(new SpecialModel(R.drawable.viratkohli,"Rs 7,00,000","Rs 100","KKR vs PBKS"));

        SpecialAdpater adpater = new SpecialAdpater(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adpater);

        musttryrecycler = findViewById(R.id.recycler_must_try);
        ArrayList<SpecialModel> list1 = new ArrayList<>();
        list1.add(new SpecialModel(R.drawable.img_1,"0","0","Fantasy Cricket"));
        list1.add(new SpecialModel(R.drawable.img_4,"0","0","Rummy"));
        list1.add(new SpecialModel(R.drawable.viratkohli,"0","0","Poker"));
        list1.add(new SpecialModel(R.drawable.img_5,"0","0","Call Break"));
        list1.add(new SpecialModel(R.drawable.img_2,"0","0","Speed Bingo"));

        MustTryadapter mustTryadapter = new MustTryadapter(list1,this);
        musttryrecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        musttryrecycler.setAdapter(mustTryadapter);

        RecyclerView mustryrecycler1 = findViewById(R.id.recycler_must_try1);
        ArrayList<SpecialModel> list2 = new ArrayList<>();
        list2.add(new SpecialModel(R.drawable.img_4,"0","0","Fantasy Cricket"));
        list2.add(new SpecialModel(R.drawable.img_4,"0","0","Rummy"));
        list2.add(new SpecialModel(R.drawable.img_1,"0","0","Poker"));
        list2.add(new SpecialModel(R.drawable.img_3,"0","0","Call Break"));
        list2.add(new SpecialModel(R.drawable.img_2,"0","0","Speed Bingo"));
        MustTryadapter mustTryadapter1 = new MustTryadapter(list2,this);
        mustryrecycler1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        mustryrecycler1.setAdapter(mustTryadapter1);

        ImageView more = findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView = findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.referandearn:
                        Intent intent = new Intent(MainActivity.this,Referandearn.class);
                        startActivity(intent);
                        return false;
                    case R.id.helpdesk:
                        Intent intent1 = new Intent(MainActivity.this,Helpdesk.class);
                        startActivity(intent1);
                        return false;
                    case R.id.fairlplay:
                        Intent intent2 = new Intent(MainActivity.this,Fairplaypolicy.class);
                        startActivity(intent2);
                        return false;
                    case R.id.Settings:
                        Intent intent3 = new Intent(MainActivity.this,Setting.class);
                        startActivity(intent3);
                        return false;
                    case R.id.take_control:
                        Intent intent4 = new Intent(MainActivity.this,TakeControl.class);
                        startActivity(intent4);
                        return false;
                }



                return true;
            }
        });





    }
}