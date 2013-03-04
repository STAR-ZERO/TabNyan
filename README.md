# TabNyan

タブUIの管理を楽にする。

タブ内でのFragment切り替えが可能。


## Install
* cloneしてeclipseにimport
* 使いたいプロジェクトでライブラリとして追加する

## Usage

### レイアウト
レイアウトファイルはTabHost使用時と同様に。

TabWidgetの場所は変更可能。

```xml
<TabHost
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@android:id/tabhost"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TabWidget
            android:id="@android:id/tabs"
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="0"/>
        <FrameLayout
            android:id="@android:id/tabcontent"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:layout_weight="0"/>
        <FrameLayout
            android:id="@+id/realtabcontent"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"/>
    </LinearLayout>
</TabHost>
```

### Activity
TabNyanActivityを継承。

setupメソッドを必ず呼び出す。引数はFragmentで使用するViewのID, OnTabChangeListenerを渡す。

タブを追加する時はaddTabを呼び出す。

カスタムViewやFragmentに引数を渡すこともできます。詳しくはソースを見れば分かるかと…


```java
public class MainActivity extends TabNyanActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup(R.id.realtabcontent, null);

        addTab("tab1", "Tab1", Tab1Fragment.class);
        addTab("tab2", "Tab2", Tab2Fragment.class);

    }

}
``` 

### タブ内でのFragment切り替え

タブ内でFragmentを切り替える時のViewIdには com.zero.star.tabnyan.R.id.fragment を指定する

```java
FragmentTransaction t = getFragmentManager().beginTransaction();
t.addToBackStack(null);
t.replace(com.zero.star.tabnyan.R.id.fragment, new ChildFragment());
t.commit();
```


## License
TabNyan is available under the terms of the [MIT License](https://github.com/STAR-ZERO/TabNyan/blob/master/LICENSE).
