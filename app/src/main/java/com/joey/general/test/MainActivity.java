
package com.joey.general.test;

import android.app.Fragment;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.joey.general.BaseActivity;
import com.joey.general.R;
import com.joey.general.tab.TabBarItem;
import com.joey.general.tab.TabHost;

public class MainActivity extends BaseActivity {

    private TabHost tabHost;
    private  FrameLayout contentRoot;
    private LinearLayout mTabLayout;
    private JSettingFragment mainFragment;
    private JSettingFragment settingFragment;
    private JSettingFragment contactsFragment;
    private TabHost.OnTabHostChangeListener changeListener = new TabHost.OnTabHostChangeListener() {
        @Override
        public void onTagChange(TabBarItem item, int index, Fragment content) {
            switch (index){
                case 0:
            }
        }
    };

    @Override
    public void initSettings() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void initUi() {
        // TODO Auto-generated method stub
        setContentView(R.layout.activity_main);
        contentRoot = (FrameLayout)findViewById(R.id.tab_content);
        mTabLayout = (LinearLayout)findViewById(R.id.tab_layout);
        tabHost = new TabHost(this,mTabLayout,contentRoot);
        
        mainFragment = new JSettingFragment();
        settingFragment = new JSettingFragment();
        contactsFragment = new JSettingFragment();

        mainFragment.setTitle("主页");
        settingFragment.setTitle("个人中心");
        contactsFragment.setTitle("消息");


        tabHost.addTab("主页",R.drawable.tabbar_main_selector,R.drawable.tabbar_home_selected, mainFragment);
        tabHost.addTab("个人中心",R.drawable.tabbar_info_selector ,R.drawable.tabbar_profile_selected, contactsFragment);
        tabHost.addTab("消息",R.drawable.tabbar_files_selector , R.drawable.tabbar_message_center_selected,settingFragment);
        
       tabHost.changeToIndex(0);
        
    }

    @Override
    public void saveSettings() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void freeMe() {
        // TODO Auto-generated method stub
        
    }


}
