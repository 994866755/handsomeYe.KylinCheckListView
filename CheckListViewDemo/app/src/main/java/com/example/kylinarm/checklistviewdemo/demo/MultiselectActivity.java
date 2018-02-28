package com.example.kylinarm.checklistviewdemo.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kylinarm.checklistviewdemo.R;
import com.example.kylinarm.checklistviewdemo.check.KylinCheckListView;
import com.example.kylinarm.checklistviewdemo.check.KylinOnCheckListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylin on 2018/2/28.
 */

public class MultiselectActivity extends AppCompatActivity implements KylinOnCheckListener {

    private KylinCheckListView checkListView;
    private CheckBox cbAll;
    private TextView tvAll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult);
        checkListView = (KylinCheckListView) findViewById(R.id.cv_content);
        cbAll = (CheckBox) findViewById(R.id.cb_all);
        tvAll = (TextView) findViewById(R.id.tv_all);

        cbAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkListView.multAllCheck(cbAll.isChecked());
            }
        });

        initView();
        setData();
    }

    private void initView(){
        // 设置Item布局
        checkListView.setItemClass(TestViewModel.class);
        // 设置监听
        checkListView.setKylinOnCheckListener(this);
        // 设置多选
        checkListView.setShowType(KylinCheckListView.MULTISELECT);
        // 创建CheckList
        checkListView.create();
    }

    private void setData(){
        List<TestEntity> datalist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestEntity entity = new TestEntity();
            entity.title = "Item "+i;
            entity.content = "content "+i;
            datalist.add(entity);
        }

        checkListView.setDataToView(datalist);

    }

    @Override
    public void kylinCheckChange(int position, boolean isChecked) {
        if (checkListView.isMultAll()){
            cbAll.setChecked(true);
        }else {
            cbAll.setChecked(false);
        }
    }

}
