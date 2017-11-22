package com.example.apps.livinghumanity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by apps on 11/21/2017.
 */
public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private TextView toolbar_title, seeMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("Home");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        seeMore = (TextView) findViewById(R.id.seeMore);
        seeMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogPopup customDialogPopup = new CustomDialogPopup(HomeActivity.this);
                customDialogPopup.show();
            }
        });
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


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Toast.makeText(getApplicationContext(), "You are in Home page.", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_about_us) {
            Toast.makeText(getApplicationContext(), "About Us page is not ready.", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_services) {
            Toast.makeText(getApplicationContext(), "Services page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_gallery) {
            Toast.makeText(getApplicationContext(), "Gallery page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_faq) {
            Toast.makeText(getApplicationContext(), "FAQ page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_contact_us) {
            Toast.makeText(getApplicationContext(), "Contact Us page is not ready.", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
