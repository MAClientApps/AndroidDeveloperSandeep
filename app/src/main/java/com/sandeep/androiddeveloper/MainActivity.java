package com.sandeep.androiddeveloper;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sandeep.androiddeveloper.databinding.BottomsheetNoteBinding;

import soup.neumorphism.NeumorphImageButton;

public class MainActivity extends AppCompatActivity {
    NeumorphImageButton neuMorphImageButton1,neuMorphImageButton2,neuMorphImageButton3,neuMorphImageButton4;
    NeumorphImageButton NeumorphImageButton1,NeumorphImageButton2,NeumorphImageButton3,NeumorphImageButton4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find The All Id.
        neuMorphImageButton1 = findViewById(R.id.nib_back1);
        neuMorphImageButton2 = findViewById(R.id.nib_back2);
        neuMorphImageButton3 = findViewById(R.id.nib_back3);
        neuMorphImageButton4 = findViewById(R.id.nib_back4);
        NeumorphImageButton1 = findViewById(R.id.NeumorphImageButton1);
        NeumorphImageButton2 = findViewById(R.id.NeumorphImageButton2);
        NeumorphImageButton3 = findViewById(R.id.NeumorphImageButton3);
        NeumorphImageButton4 = findViewById(R.id.NeumorphImageButton4);
        neuMorphImageButton1.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 1;
            gotoTheNextPage(sActivity,Point);
        });
        neuMorphImageButton2.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 2;
            gotoTheNextPage(sActivity,Point);
        });
        neuMorphImageButton3.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 3;
            gotoTheNextPage(sActivity,Point);
        });
        neuMorphImageButton4.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 4;
            gotoTheNextPage(sActivity,Point);
        });
        NeumorphImageButton1.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 1;
            gotoTheNextPage(sActivity,Point);
        });
        NeumorphImageButton2.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 2;
            gotoTheNextPage(sActivity,Point);
        });
        NeumorphImageButton3.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 3;
            gotoTheNextPage(sActivity,Point);
        });
        NeumorphImageButton4.setOnClickListener(v -> {
            SActivity sActivity = new SActivity();
            int Point = 4;
            gotoTheNextPage(sActivity,Point);
        });
    }

    private void gotoTheNextPage(Context activity,int POINT) {
        Intent GotoThePage = new Intent(MainActivity.this,activity.getClass());
        GotoThePage.putExtra("setPoint",POINT);
        startActivity(GotoThePage);
    }
}
