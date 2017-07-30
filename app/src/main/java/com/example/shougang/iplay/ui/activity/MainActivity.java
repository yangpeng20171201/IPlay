package com.example.shougang.iplay.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.example.shougang.iplay.R;
import com.example.shougang.iplay.ui.fragment.BaseFragment;
import com.example.shougang.iplay.ui.fragment.MainFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
   @BindView(R.id.main_viewpager)
    ViewPager main_viewpager;
    MainFragment mainFragment;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //判断版本是否大于4.4  api19
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            setTranslucentStatus(true);
    }
        setContentView(R.layout.activity_main);

        //绑定当前页面根布局
       ButterKnife.bind(this);
        setFragment();
        initButtonNavigationBar();
    }

    private void initButtonNavigationBar() {

    }

    public void intnet2local() {
        Toast.makeText(this, "aaaaaaaaaa", Toast.LENGTH_SHORT).show();
//        addFragment(new MainLiveFragment());
    }

    private void addFragment(BaseFragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.main_pager, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    private void setFragment() {

       mainFragment=new MainFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.main_pager,mainFragment);
        transaction.commit();


    }
    // 设置状态栏透明状态
    private void setTranslucentStatus(boolean b) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (b) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

}
