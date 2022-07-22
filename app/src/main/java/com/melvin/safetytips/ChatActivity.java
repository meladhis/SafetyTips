package com.melvin.safetytips;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.melvin.safetytips.Fragments.calenderFragment;
import com.melvin.safetytips.Fragments.GraphFragment;
import com.melvin.safetytips.Fragments.ProfileFragment;
import com.melvin.safetytips.Fragments.HomeFragment;

public class ChatActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;
    private Fragment selectorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        bottomNavigation = findViewById(R.id.btn_nav);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.calender:
                        selectorFragment = new calenderFragment();
                        break;

                    case R.id.heart:
                        selectorFragment = new GraphFragment();
                        break;

                    case R.id.profile:
                        selectorFragment = new ProfileFragment();
                        break;

                    case R.id.home1:
                        selectorFragment = new HomeFragment();
                        break;
                }
                if (selectorFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,selectorFragment).commit();
                }
                return true;
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new calenderFragment()).commit();
    }

}
