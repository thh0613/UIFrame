package com.oridway.www.uiframe.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.oridway.www.uiframe.R;
import com.oridway.www.uiframe.adpter.CandidateListAdapter;
import com.oridway.www.uiframe.adpter.ViewPagerAdapter;
import com.oridway.www.uiframe.bean.Candidate;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 包含标题栏和网格布局
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = "MainActivity";

    @BindView(R.id.tv_title_middle)
    TextView title;
    @BindView(R.id.title_left)
    ImageView backButton;
    @BindView(R.id.btn1)
    TextView btn1;
    @BindView(R.id.btn2)
    TextView btn2;
    @BindView(R.id.btn3)
    TextView btn3;
    @BindView(R.id.btn4)
    TextView btn4;

    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();

    }

    private void initView() {
        title.setText("主页");
    }

    private void initData() {
        mContext = this;
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn4) {
            startActivity(new Intent(mContext, IndexActivity.class));
        }

        if (view.getId() == R.id.btn3) {
            startActivity(new Intent(mContext, UserListActivity.class));
        }

        if (view.getId() == R.id.btn2) {
            startActivity(new Intent(mContext, ReportListActivity.class));
        }

        if (view.getId() == R.id.btn1) {
            startActivity(new Intent(mContext, SectionListActivity.class));
        }

        if (view.getId() == R.id.title_left) {
            finish();
        }
    }
}
