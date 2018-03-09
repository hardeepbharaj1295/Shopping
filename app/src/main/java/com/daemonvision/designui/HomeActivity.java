package com.daemonvision.designui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.daemonvision.designui.fragment.HomeFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String TAG = HomeActivity.class.getName();
    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.main_drawer);
        navigationView.setNavigationItemSelectedListener(this);

        this.mFragmentManager = getSupportFragmentManager();

        this.mFragmentManager.beginTransaction().replace(R.id.frame_container, new HomeFragment()).commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        menuItem.setChecked(true);
        if (menuItem.getItemId() == R.id.product) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityMenuCategory.class));
        }
        if (menuItem.getItemId() == R.id.cart) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityCart.class));
        }
        if (menuItem.getItemId() == R.id.checkout) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityCheckout.class));
        }
        if (menuItem.getItemId() == R.id.profile) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityProfile.class));
        }
        if (menuItem.getItemId() == R.id.information) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityInformation.class));
        }
        if (menuItem.getItemId() == R.id.about) {
            //MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), ActivityAbout.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
