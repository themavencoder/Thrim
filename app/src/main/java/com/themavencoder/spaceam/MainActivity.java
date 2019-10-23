package com.themavencoder.spaceam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.themavencoder.spaceam.fragments.AddFragment;
import com.themavencoder.spaceam.fragments.HomeFragment;
import com.themavencoder.spaceam.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private FrameLayout mFrameLayout;
    private HomeFragment homeFragment;
    private AddFragment addFragment;
    private ProfileFragment profileFragment;
    private AHBottomNavigation bottomNavigation;
    private AHBottomNavigationItem item1, item2, item3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFrameLayout = findViewById(R.id.frame_layout);
        bottomNavigation = findViewById(R.id.bottom_navigation_view);
        homeFragment = new HomeFragment();
        addFragment = new AddFragment();
        profileFragment = new ProfileFragment();

        item1 = new AHBottomNavigationItem("Home", R.drawable.ic_home_black_24dp, R.color.white);
        item2 = new AHBottomNavigationItem("Add Products", R.drawable.ic_add_black_24dp, R.color.white);
        item3 = new AHBottomNavigationItem("Profile", R.drawable.ic_person_black_24dp, R.color.white);
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.setBehaviorTranslationEnabled(false);
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.ash));
        bottomNavigation.setAccentColor(getResources().getColor(R.color.colorAccent));
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomNavigation.setCurrentItem(1);
        setFragment(addFragment);
        //defaultPosition();
        navSelectedListener();

    }

    private void defaultPosition() {
        bottomNavigation.setOnNavigationPositionListener(new AHBottomNavigation.OnNavigationPositionListener() {
            @Override
            public void onPositionChange(int y) {
                setFragment(addFragment);
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
    private void navSelectedListener() {
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (position == 0) {
                    setFragment(homeFragment);
                    return true;
                } else if (position == 1) {
                    setFragment(addFragment);
                    return true;
                } else if (position == 2) {
                    setFragment(profileFragment);
                    return true;
                }
                return false;

            }
        });
    }
}
