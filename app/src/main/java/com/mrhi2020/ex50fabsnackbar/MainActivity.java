package com.mrhi2020.ex50fabsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFab(View view) {
        //Toast의 업그레이드 버전 : Snackbar
        Snackbar.make(view, "This is snackbar", Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click ok", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }

    public void clickBtn(View view) {
        //새로운 CoordinatorLayout을 이용하면 원하는 위치에
        //snackbar를 보이게 할 수 있음.

        //스낵바가 놓여질 CoordinatorLayout 뷰객체를 참조하기
        View v= findViewById(R.id.layout_snackbar_container);
        Snackbar.make(v, "SNACKBAR", Snackbar.LENGTH_LONG).setAction("submit", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();

    }
}
