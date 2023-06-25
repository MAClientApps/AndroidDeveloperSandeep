package com.sandeep.androiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sandeep.androiddeveloper.databinding.BottomBinding;
import com.sandeep.androiddeveloper.databinding.BottomsheetNoteBinding;

public class SActivity extends AppCompatActivity {
    ImageView backPageIV,setImageViewBgIv;
    TextView setTextTV;
    LinearLayout buttonLL;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sactivity);
        // Find The All Id.
        backPageIV = findViewById(R.id.backPageIV);
        buttonLL = findViewById(R.id.buttonLL);
        setImageViewBgIv = findViewById(R.id.setImageViewBgIv);
        setTextTV = findViewById(R.id.setTextTV);
        int point = getIntent().getIntExtra("setPoint",1);
        backPageIV.setOnClickListener(v -> {
            MainActivity mainActivity = new MainActivity();
            HomePage(mainActivity);
        });
        switch (point){
            case 1:
                setImageViewBgIv.setImageResource(R.drawable.ff);
                setTextTV.setText("First");
                break;
            case 2:
                setImageViewBgIv.setImageResource(R.drawable.ss);
                setTextTV.setText("Second");
                break;
            case 3:
                setImageViewBgIv.setImageResource(R.drawable.tt);
                setTextTV.setText("Third");
                break;
            case 4:
                setImageViewBgIv.setImageResource(R.drawable.fforr);
                setTextTV.setText("Fourth");
                break;
            default:
                setImageViewBgIv.setImageResource(R.drawable.p);
                setTextTV.setText("Default");
                break;
        }
        buttonLL.setOnClickListener(v -> {
            showBottomSheet();
        });
    }
    private void showBottomSheet() {
        View view = LayoutInflater.from(this).inflate(R.layout.bottomsheet_note, null);
        BottomsheetNoteBinding bottomsheetNoteBinding = BottomsheetNoteBinding.bind(view);
        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(view);
        dialog.show();
        bottomsheetNoteBinding.buttonLinearLayout.setOnClickListener(v -> {
            showBottom();
        });
    }

    private void showBottom() {
        View view = LayoutInflater.from(this).inflate(R.layout.bottom, null);
        BottomBinding bottomBinding = BottomBinding.bind(view);
        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(view);
        dialog.show();
        bottomBinding.doneBtTv.setOnClickListener(v -> {
            SActivity sActivity = new SActivity() ;
            HomePage(sActivity);
        });
    }
    private void HomePage(Context activity) {
        Intent GoBackPreviousPage = new Intent(SActivity.this,activity.getClass());
        startActivity(GoBackPreviousPage);
        finish();// the current activity will get finished.
    }
}