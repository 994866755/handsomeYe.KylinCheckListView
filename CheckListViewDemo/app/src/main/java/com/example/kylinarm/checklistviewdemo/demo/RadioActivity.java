package com.example.kylinarm.checklistviewdemo.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import com.example.kylinarm.checklistviewdemo.R;
import com.example.kylinarm.checklistviewdemo.check.KylinCheckListView;
import com.example.kylinarm.checklistviewdemo.check.KylinOnCheckListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylin on 2018/2/28.
 */

public class RadioActivity extends AppCompatActivity implements KylinOnCheckListener {

    private KylinCheckListView checkListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        checkListView = (KylinCheckListView) findViewById(R.id.cv_content);
        initView();
        setData();
    }

    private void initView(){
        // 设置Item布局
        checkListView.setItemClass(TestViewModel.class);
        // 设置布局居中
        checkListView.setItemGravity(Gravity.CENTER);
        // 设置监听
        checkListView.setKylinOnCheckListener(this);
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
        Toast.makeText(this,"点击第"+position+"个ITEM",Toast.LENGTH_SHORT).show();
    }

}
