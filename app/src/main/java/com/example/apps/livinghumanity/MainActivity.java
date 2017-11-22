package com.example.apps.livinghumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout ll_home_btn, ll_about_btn, ll_services_btn, ll_gallery_btn, ll_faq_btn, ll_contact_btn;
    ImageButton fb_follow, youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_home_btn = (LinearLayout) findViewById(R.id.ll_home_btn);
        ll_about_btn = (LinearLayout) findViewById(R.id.ll_about_btn);
        ll_services_btn = (LinearLayout) findViewById(R.id.ll_services_btn);
        ll_gallery_btn = (LinearLayout) findViewById(R.id.ll_gallery_btn);
        ll_faq_btn = (LinearLayout) findViewById(R.id.ll_faq_btn);
        ll_contact_btn = (LinearLayout) findViewById(R.id.ll_contact_btn);

        ll_home_btn.setOnClickListener(this);
        ll_about_btn.setOnClickListener(this);
        ll_services_btn.setOnClickListener(this);
        ll_gallery_btn.setOnClickListener(this);
        ll_faq_btn.setOnClickListener(this);
        ll_contact_btn.setOnClickListener(this);

        fb_follow = (ImageButton) findViewById(R.id.fb_follow);
        youtube = (ImageButton) findViewById(R.id.youtube);
        fb_follow.setOnClickListener(this);
        youtube.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_home_btn:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                break;
            case R.id.ll_about_btn:
                startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
                break;
            case R.id.ll_services_btn:
                startActivity(new Intent(MainActivity.this, ServicesActivity.class));
                break;
            case R.id.ll_gallery_btn:
                startActivity(new Intent(MainActivity.this, GalleryActivity.class));
                break;
            case R.id.ll_faq_btn:
                startActivity(new Intent(MainActivity.this, FaqActivity.class));
                break;
            case R.id.ll_contact_btn:
                startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
                break;
            case R.id.fb_follow:
                Toast.makeText(MainActivity.this, "Bhaag bhosdi ke", Toast.LENGTH_LONG).show();
                break;
            case R.id.youtube:
                Toast.makeText(MainActivity.this, "Tu to CHUTIYA hai be", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
