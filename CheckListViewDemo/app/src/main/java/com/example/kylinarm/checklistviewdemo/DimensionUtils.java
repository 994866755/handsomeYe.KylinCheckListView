package com.example.kylinarm.checklistviewdemo;

import android.content.Context;

/**
 * Created by kylin on 2017/10/18.
 */

public class DimensionUtils {

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale +0.5f);
    }

}
