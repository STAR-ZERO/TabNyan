# TabNyan

TabActivityに似たもの。

タブ内にFragmentを使用してタブの管理を楽にするやつ。


## Install
* cloneしてeclipseにimport
* 使いたいプロジェクトでライブラリとして追加する

## Usage

### Activity
TabNyanActivityを継承。

レイアウトファイルはTabHost使用時と同様に。

setupメソッドを必ず呼び出す。引数はFragmentで使用するViewのID, OnTabChangeListenerを渡す。

タブを追加する時はaddTabを呼び出す。


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

### タブ内Fragment切り替え

タブ内でFragmentを切り替える時のViewIdには com.zero.star.tabnyan.R.id.fragment を指定する

```java
FragmentTransaction t = getFragmentManager().beginTransaction();
t.addToBackStack(null);
t.replace(com.zero.star.tabnyan.R.id.fragment, new ChildFragment());
t.commit();
```


