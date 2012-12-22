# TabNyan

TabActivityに似たもの。

タブ内にFragmentを使用してタブの管理を楽にするやつ。


## Install
* cloneしてeclipseにimport
* 使いたいプロジェクトでライブラリとして追加する

## Usage

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

詳細はソースコードを。
