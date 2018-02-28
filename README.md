# handsomeYe.KylinCheckListView
单选/多选 列表组件


### KylinCheckListView只支持传入List列表
并且传入的数据要继承CheckListEntity

```
public class TestEntity extends CheckListEntity {

    public String title;
    public String content;

}
```

### 自定义属性
在attrs中添加样式
```
<!-- 选框样式 -->
    <declare-styleable name="KylinCheckListViewStyle">
        <!-- checkbox的margin -->
        <attr name="cb_margin_left" format="dimension"/>
        <attr name="cb_margin_right" format="dimension"/>
        <attr name="cb_margin_top" format="dimension"/>
        <attr name="cb_margin_bottom" format="dimension"/>
        <!-- checkbox的背景-->
        <attr name="cb_backgroup" format="reference"/>
        <!-- item的背景-->
        <attr name="item_backgroup" format="reference"/>
        <!-- item的gravity-->
        <attr name="item_gravity" format="integer"/>
        <!-- recyclerview的分割线-->
        <attr name="item_decoration" format="dimension"/>
        <!-- 展示位置-->
        <attr name="show_location" format="integer"/>
        <!-- 单选/多选-->
        <attr name="show_type" format="integer"/>
    </declare-styleable>
```

### 使用

##### 1.定义布局
```
<com.example.kylinarm.checklistviewdemo.check.KylinCheckListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/cv_content"
        >
</com.example.kylinarm.checklistviewdemo.check.KylinCheckListView>
```

##### 2.初始化组件
```
        checkListView.setItemClass(TestViewModel.class);
        // 设置布局居中
        checkListView.setItemGravity(Gravity.CENTER);
        // 设置监听
        checkListView.setKylinOnCheckListener(this);
        // 创建CheckList
        checkListView.create();
```
注意，必须调用checkListView.create();方法，不然不会显示。

##### 3.设置监听
可以实现KylinOnCheckListener接口来监听选框的选择。

### 常用方法
checkListView.create() 初始化控件
checkListView.radioResult() 返回单选的结果
checkListView.multResults() 返回多选的结果
checkListView.multCount() 返回已选中的数量
checkListView.isMultAll() 多选情况下判断是否全选
checkListView.multAllCheck() 设置全选
checkListView.radioCheck() 设置单选
checkListView.lazyUpdate() 懒更新

checkListView.setItemClass() 设置Item的class
checkListView.getDatalist() 返回数据列表
checkListView.setShowType() 设置是单选还是多选
checkListView.setShowLacation() 设置选框显示在左还是在右

##### 其它方法可以参考详细文章

文章地址：https://www.jianshu.com/p/e4cebd5d79bc













