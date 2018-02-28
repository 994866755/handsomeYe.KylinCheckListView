package com.example.kylinarm.checklistviewdemo.check;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by kylin on 2018/2/27.
 */

public abstract class CheckViewModel<T> {

    protected Context context;
    protected View contentView;
    protected T data;
    protected Bundle bundel;

    public CheckViewModel(Context context){
        this.context = context;
        contentView = LayoutInflater.from(context).inflate(getLayout(),null);
        initView();
    }

    public CheckViewModel(Context context, Bundle bundel){
        this.context = context;
        this.bundel = bundel;
        contentView = LayoutInflater.from(context).inflate(getLayout(),null);
        initView();
    }

    protected abstract int getLayout();
    protected abstract void initView();

    public void setData(T data){
        this.data = data;
        setDataToView();
    }

    protected abstract void setDataToView();

    public View getContentView() {
        return contentView;
    }
}
