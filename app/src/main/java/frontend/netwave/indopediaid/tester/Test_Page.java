package frontend.netwave.indopediaid.tester;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import frontend.netwave.indopedia.R;
import frontend.netwave.indopediaid.adapter.ExpandableListAdapter;

import java.util.Map;
import java.util.List;

public class Test_Page extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToogle;
    String mActivityTile;
    String[] items;

    ExpandableListAdapter adapter;
    ExpandableListView expandableListView;
    NavigationView mNavigationView;
    List<String> lstTitle;
    Map<String, List<String>> lstChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_page);

    }
}
