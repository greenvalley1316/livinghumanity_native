package com.example.apps.livinghumanity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by apps on 11/22/2017.
 */
public class AboutUsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private TextView toolbar_title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("About Us");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AboutUsActivity.this, android.R.style.Theme_DeviceDefault_Dialog);
            alertDialogBuilder
                    .setMessage("Do you want to exit the App?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @SuppressLint("NewApi")
                        public void onClick(DialogInterface dialog, int id) {
                            finishAffinity();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            startActivity(new Intent(AboutUsActivity.this, HomeActivity.class));
            //Toast.makeText(getApplicationContext(), "You are in Home page.", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_about_us) {
            Toast.makeText(getApplicationContext(), "You are in About Us page.", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_services) {
            startActivity(new Intent(AboutUsActivity.this, ServicesActivity.class));
            //Toast.makeText(getApplicationContext(), "Services page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(AboutUsActivity.this, GalleryActivity.class));
            //Toast.makeText(getApplicationContext(), "Gallery page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_faq) {
            startActivity(new Intent(AboutUsActivity.this, FaqActivity.class));
            //Toast.makeText(getApplicationContext(), "FAQ page is not ready.", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_contact_us) {
            startActivity(new Intent(AboutUsActivity.this, ContactUsActivity.class));
            //Toast.makeText(getApplicationContext(), "Contact Us page is not ready.", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
