package com.example.apps.livinghumanity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by apps on 11/22/2017.
 */
public class CustomDialogPopup extends Dialog {
    public CustomDialogPopup(Context context) {
        super(context);
    }

    private TextView tv_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.dialog_box);

        tv_description = (TextView) findViewById(R.id.tv_description);
//        Typeface type = Typeface.createFromAsset(getContext().getAssets(),"fonts/AllHookedUp.ttf");
//        tv_description.setTypeface(type);
    }
}
