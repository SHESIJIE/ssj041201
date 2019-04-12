package shesijie.bawei.com.ssj041201.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shesijie.bawei.com.ssj041201.R;

public class MainActivity extends AppCompatActivity implements IView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    @Override
    public void getPresenter(String name) {

    }
}
